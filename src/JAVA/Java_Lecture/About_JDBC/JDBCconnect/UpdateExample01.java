package JAVA.Java_Lecture.About_JDBC.JDBCconnect;

import java.io.File;
import java.io.FileInputStream;
import java.sql.*;

import static java.time.LocalTime.now;

public class UpdateExample01 {
    public static void main(String[] args) {
        Connection conn = null;
        try {
            //JDBC Driver 등록
            Class.forName("com.mysql.cj.jdbc.Driver");

            //연결하기
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/sqldb?serverTimezone=Asia/Seoul",
                    "root",
                    "0000"
            );

            //매개변수화된 SQL문 작성
            String sql = new StringBuilder().append("update boards set ")
                    .append("bfilename=?,")
                    .append("bfiledata=?")
                    .append("where bno=?")
                    .toString();

            //PreparedStatement 얻기 및 값 지정
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,"크리스마스");
            pstmt.setBlob(2,new FileInputStream("src/JAVA/Java_Lecture/About_JDBC/JDBCconnect/chrismas.jpg"));
            pstmt.setInt(3,1);
            //SQL문 실행
            int rows = pstmt.executeUpdate();

            System.out.println("저장된 행 수: " + rows);

            //PreparedStatement 닫기

            pstmt.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(conn != null) {
                try {
                    //연결 끊기
                    conn.close();;
                } catch (SQLException e) {}
            }
        }
    }
}



