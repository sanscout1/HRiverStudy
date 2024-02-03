package JAVA.Java_Test.BoardProject_2.src;


import JAVA.Java_Test.ioex01.MemoDao;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;



public class BoardDB {


        /*
    오호 아까 봤떤 싱글톤 패턴이 또 있지요
    이해하고 있다면 그런가보다 합시다.
     */
    private static volatile BoardDB instance;

    public static BoardDB getInstance() {  //싱글톤
        if (instance == null) {
            instance = new BoardDB();
        }
        return instance;
    }

    private Connection conn = null;

    /*
    잘 보면 우리가 실습한 코드내용에서, 잘 쪼개서 함수로 만든게 보이죠?
    네 이게 오류나기 시작하면서 멘탈이 나가는거지 사실 배운거 잘 조립하면 된다는 것을 볼 수 있습니다.
    하지만 저도 4시간이나 걸려서 해결 했네요
    모든 건 경험의 차이지 실력의 차이가 아니랍니다.
    그 다음은 우리가 열심히 해온 sql 문을 잘 작성하면 모든게 해결! 여기까지 설명입니다.
     */

    public void connectDB() {

        try {
            //JDBC Driver 등록
            Class.forName("com.mysql.cj.jdbc.Driver");

            //연결하기
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/boardproject?serverTimezone=Asia/Seoul",
                    "root",
                    "0000"
            );

           // System.out.println("연결성공");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void writeDB(Board board) {
        try {

            String sql = "insert into boards (btitle,bcontent,bwriter,Bdate)" +
                    "values(?,?,?,?)";

            //PreparedStatement 얻기 및 값 지정
            PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pstmt.setString(1, board.getBtitle());
            pstmt.setString(2, board.getBcontent());
            pstmt.setString(3, board.getBwriter());
            pstmt.setString(4, board.getDate());

            //SQL문 실행
            pstmt.executeUpdate();
            //PreparedStatement 닫기

            pstmt.close();
        } catch (Exception e) {
        }
    }

    public void updateDB(Board board) {
        try {
            String sql = "update boards set btitle =?, bcontent =?, bwriter= ? " +
                    "where bno =?";

            //PreparedStatement 얻기 및 값 지정
            PreparedStatement pstmt = conn.prepareStatement(sql); // bno 값 가져오는거 연구하자
            pstmt.setString(1, board.getBtitle());
            pstmt.setString(2, board.getBcontent());
            pstmt.setString(3, board.getBwriter());
            pstmt.setInt(4, board.getBno());


            //SQL문 실행
            int rows = pstmt.executeUpdate();

            //PreparedStatement 닫기

            pstmt.close();
        } catch (Exception e) {}
    }

    public void deleteBoard(Board board) {
        try {
            String sql = "delete from boards " +
                    "where bno =?";

            //PreparedStatement 얻기 및 값 지정
            PreparedStatement pstmt = conn.prepareStatement(sql); // bno 값 가져오는거 연구하자
            pstmt.setInt(1, board.getBno());

            //SQL문 실행
            int rows = pstmt.executeUpdate();

            //PreparedStatement 닫기

            pstmt.close();
        } catch (Exception e) {}
    }

    public void clearBoard()  {
        try {
            String sql = "truncate table boards;" ;

            //PreparedStatement 얻기 및 값 지정
            PreparedStatement pstmt = conn.prepareStatement(sql);
            //SQL문 실행
            pstmt.executeUpdate();

            //PreparedStatement 닫기
            pstmt.close();
        } catch (Exception e) {}
    }

    public List<Board> readDB() {
        List<Board> boardList = new ArrayList<>();
        try {
            String sql = "Select bno,btitle,bcontent,bwriter,Bdate from boards ";

            //PreparedStatement 얻기 및 값 지정
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

            //PreparedStatement 닫기
            rs.close();
            pstmt.close();


        } catch (Exception e) {

        } finally {
            return boardList;
        }

    }

    public void closeDB() {
        if (conn != null) {
            try {
                //연결 끊기
                conn.close();
         //       System.out.println("연결 해제 성공");
            } catch (SQLException e) {
            }
        }
    }
}



