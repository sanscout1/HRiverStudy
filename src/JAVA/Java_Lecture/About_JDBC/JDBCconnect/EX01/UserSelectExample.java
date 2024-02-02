package JAVA.Java_Lecture.About_JDBC.JDBCconnect.EX01;

import java.sql.*;

public class UserSelectExample {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			//JDBC Driver 등록
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("driver 무야호");
			//연결하기
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqldb?serverTimezone=Asia/Seoul","root","0000");

			//매개변수화된 SQL문 작성
            String sql = "Select userid,username,userpassword,userage,useremail from users " +
                    "where userid = ?";

			//PreparedStatement 얻기 및 값 지정
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,"ssg");

			//SQL문 실행
            ResultSet rs = pstmt.executeQuery();

			if(rs.next()){
				User user = new User();
				user.setUserid(rs.getString("userid"));
				user.setUserpassword(rs.getString("userpassword"));
				user.setUsername(rs.getString("username"));
				user.setUserAge(rs.getInt("userage"));
				user.setUserEmail(rs.getString("useremail"));
				System.out.println(user);
			} else {
				System.out.println("사용자 모두 출력 완료");
			}


			rs.close();
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
