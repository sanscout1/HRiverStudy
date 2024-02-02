package JAVA.Java_Lecture.About_JDBC.JDBCconnect;

import java.io.File;
import java.io.FileInputStream;
import java.sql.*;

import static java.time.LocalTime.now;

public class UpdateExample {
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
            String sql = new StringBuilder().append("update users set ")
                    .append("userpassword=? ")
                    .append("where userid=?")
                            .toString();

            //PreparedStatement 얻기 및 값 지정
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,"12345");
            pstmt.setString(2,"ssg");

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



