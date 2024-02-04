package JAVA.Java_Test.BoardProject_2.src;


import JAVA.Java_Test.ioex01.MemoDao;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;



public class BoardDB {
    private Connection conn = null;
    private List<String> sqlStatements = new ArrayList<>();  // sql 문 저장 리스트
    private List<List<Object>> paramsList = new ArrayList<>();  // PreparedStatement 의 매개변수 리스트를 저장한 리스트
    private List<Boolean> returnGeneratedKeysList = new ArrayList<>(); // PreparedStatement의 자동 생성키 여부 저장 리스트
    private static volatile BoardDB instance;
    /*
    ***********************************************************************************
     */
    public static BoardDB getInstance() {  //싱글톤
        if (instance == null) {
            instance = new BoardDB();
        }
        return instance;
    }

    // PreparedStatement 생성
    public void createStatement(String sql, List<Object> params, boolean returnGeneratedKeys) {
        sqlStatements.add(sql);  // sql 문 저장
        paramsList.add(params);  // 매겨변수 리스트 저장
        returnGeneratedKeysList.add(returnGeneratedKeys);  // 자동 생성 키 (auto_increment )여부 저장
    }

    // 저장해둔 PrepareStatement 들을 모두 실행
    public void executeBatch() {
        try {
            connectDB(); // 데이터베이스 연결
            for (int i = 0; i < sqlStatements.size(); i++) {
                PreparedStatement pstmt;
                // PreparedStatement 을 RETURN_GENERATED_KEYS 여부에 따라 생성 후
                if (returnGeneratedKeysList.get(i)) { // 해당 SQL이 RETURN_GENERATED_KEYS 옵션을 요구하는지 확인
                    pstmt = conn.prepareStatement(sqlStatements.get(i), Statement.RETURN_GENERATED_KEYS);
                } else {
                    pstmt = conn.prepareStatement(sqlStatements.get(i));
                }

                // 매개 변수 리스트을 설정
                setParams(pstmt, paramsList.get(i));
                pstmt.executeUpdate();
                pstmt.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeDB(); // 데이터베이스 연결 닫기
        }
    }
    // PreparedStatement 의 매개변수들을 설정
    private void setParams(PreparedStatement pstmt, List<Object> params) throws SQLException {
        for (int i = 0; i < params.size(); i++) {
            // setObject api를 확인해볼 것
            //  void setObject(int parameterIndex, Object x) throws SQLException;
            // params 매개변수 리스트에 저장되어 있는 값을 가져와서, 각각 index와 값을 setObject로 설정 해주는 것
            pstmt.setObject(i + 1, params.get(i));

//            params 가 아래 4개 값이 저장되어 있다면 setObject 에서 왼쪽 index 와 오른쪽에 params 값을 setObject 로 설정해주는 것
//            pstmt.setString(1,"오늘은 JDBC 학습");
//            pstmt.setString(2,"MYSQL JDBC 라이브러리 학습중");
//            pstmt.setString(3,"ssg");
//            pstmt.setString(4, "snow.jpg");
//
        }
    }


    //**************************************************************************************************

    private void connectDB() {
        try {
            //JDBC Driver 등록
            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/boardproject?serverTimezone=Asia/Seoul",
                    "root",
                    "0000"
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void writeDB(Board board) {
        try {
            String sql = "insert into boards (btitle,bcontent,bwriter,Bdate)" +
                    "values(?,?,?,?) " ;

            // pstmt.setString(1,"오늘은 JDBC 학습"); 에서 뒤에 "오늘은 JDBC 학습" 값들을 저장 하는 리스트
            // 어떤 값이 올지 모르니 Object 리스트로 받아 넣어둔다.
            List<Object> paramList = new ArrayList<>();
            paramList.add(board.getBtitle());
            paramList.add(board.getBcontent());
            paramList.add(board.getBwriter());
            paramList.add(board.getDate());
            createStatement(sql,paramList,true);
        } catch (Exception e) {
        }
    }

    public void updateDB(Board board) {
        try {
            String sql = "update boards set btitle =?, bcontent =?, bwriter= ? " +
                    "where bno =?";

            List<Object> paramList = new ArrayList<>();
            paramList.add(board.getBtitle());
            paramList.add(board.getBcontent());
            paramList.add(board.getBwriter());
            paramList.add(board.getBno());
            createStatement(sql,paramList,false);
        } catch (Exception e) {}
    }

    public void deleteBoard(Board board) {
        try {
            String sql = "delete from boards " +
                    "where bno =?";

            List<Object> paramList = new ArrayList<>();
            paramList.add(board.getBno());
            createStatement(sql,paramList,false);
        } catch (Exception e) {}
    }

    public void clearBoard()  {
        try {
            String sql = "truncate table boards;" ;
            List<Object> paramList = new ArrayList<>();
            createStatement(sql,paramList,false);
        } catch (Exception e) {}
    }



    // readDB는 프로그램 시작 시 DB의 데이터를 가져오는 함수, 잠시 DB와 연결해서 가져온다.
    public List<Board> readDB() {
        connectDB();
        List<Board> boardList = new ArrayList<>();
        try {
            String sql = "Select bno,btitle,bcontent,bwriter,Bdate from boards ";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Board board = new Board();
                board.setBno(rs.getInt("bno"));
                board.setBtitle(rs.getString("btitle"));
                board.setBcontent(rs.getString("bcontent"));
                board.setBwriter(rs.getString("bwriter"));
                board.pickDate(rs.getString("bdate"));
                boardList.add(board);
            }
            rs.close();
            pstmt.close();
            closeDB();
        } catch (Exception e) {

        } finally {
            return boardList;
        }
    }

    private void closeDB() {
        try {
        if (conn != null) {
                conn.close();
        }
        } catch (SQLException e) {
        }
    }
}