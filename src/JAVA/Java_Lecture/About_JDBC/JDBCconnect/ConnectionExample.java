package JAVA.Java_Lecture.About_JDBC.JDBCconnect;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionExample {
    public static void main(String[] args) {
        Connection conn = null;
        try {
            //1. JDBC Driver 등록
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("DRiver Load Ok");

            //2. 연결하기
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqldb?serverTimezone=Asia/Seoul", "root", "0000");
//            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqldb?characterEncoding=UTF-8&serverTimezone=UTC", "root", "0000");
            System.out.println("연결 성공" + conn);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    //3. 연결 끊기
					conn.close();

                    System.out.println("연결 끊기");
                } catch (SQLException e) {
                }
            }
        }
    }
}
