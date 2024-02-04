package JAVA.Java_Test.BoardProject_2.src;


import JAVA.Java_Test.ioex01.MemoDao;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;



public class BoardDB {
    private Connection conn = null;
    private List<String> sqlStatements = new ArrayList<>();
    private List<List<Object>> paramsList = new ArrayList<>();
    private List<Boolean> returnGeneratedKeysList = new ArrayList<>();
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

    public void createStatement(String sql, List<Object> params, boolean returnGeneratedKeys) { // RETURN_GENERATED_KEYS 여부 추가
        sqlStatements.add(sql);
        paramsList.add(params);
        returnGeneratedKeysList.add(returnGeneratedKeys); // 해당 SQL의 RETURN_GENERATED_KEYS 여부를 추가
    }

    public void executeBatch() {
        try {
            connectDB(); // 데이터베이스 연결
            for (int i = 0; i < sqlStatements.size(); i++) {
                PreparedStatement pstmt;
                if (returnGeneratedKeysList.get(i)) { // 해당 SQL이 RETURN_GENERATED_KEYS 옵션을 요구하는지 확인
                    pstmt = conn.prepareStatement(sqlStatements.get(i), Statement.RETURN_GENERATED_KEYS);
                } else {
                    pstmt = conn.prepareStatement(sqlStatements.get(i));
                }
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

    private void setParams(PreparedStatement pstmt, List<Object> params) throws SQLException {
        for (int i = 0; i < params.size(); i++) {
            pstmt.setObject(i + 1, params.get(i));
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