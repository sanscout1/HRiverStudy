package JAVA.Java_Lecture.About_JDBC.JDBCconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserInsertExample {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			//JDBC Driver 등록
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("driver 무야호");
			//연결하기
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqldb?serverTimezone=Asia/Seoul","root","0000");

			//매개변수화된 SQL문 작성
            String sql = "insert into users (userid,username,userpassword,userage,useremail)" +
                    "values(?,?,?,?,?)";

			//PreparedStatement 얻기 및 값 지정
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,"ssglw");
            pstmt.setString(2,"신세계");
            pstmt.setString(3,"1234512");
            pstmt.setInt(4,30);
            pstmt.setString(5,"ssg@gmail.com");

			//SQL문 실행
            int rows = pstmt.executeUpdate();
			System.out.println("저장된 행 수: " + rows);

			//PreparedStatement 닫기
            pstmt.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					//연결 끊기
                    conn.close();
				} catch (SQLException e) {}
			}
		}
	}
}
