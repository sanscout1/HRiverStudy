package JAVA.Java_Lecture.About_JDBC.JDBCconnect.EX02;

import JAVA.Java_Lecture.About_JDBC.JDBCconnect.EX01.User;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MultiBoardSelectExample {
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

			//매개변수화된 SQL문 작성    bno 는 autoincrement 라 넣지 않는다.
//            String sql = "insert into boards (btitle,bcontent,bwriter,bdate,bfilename,bfiledata)" +
//                    "values('오늘은 JDBC 학습','MYSQL JDBC 라이브러리 학습중','ssg',now(),'snow.jpg',binaryData)";

            String sql = "Select bno,btitle,bcontent,bwriter,bdate,bfilename,bfiledata from boards " ;

			//PreparedStatement 얻기 및 값 지정
			PreparedStatement pstmt = conn.prepareStatement(sql);

			ResultSet rs = pstmt.executeQuery();

			List<Board> boardList = new ArrayList<Board>();

			while(rs.next()){
				Board board = new Board();
				board.setBno(rs.getInt("bno"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString("bcontent"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getDate("bdate"));
				board.setBfilename(rs.getString("bfilename"));
				board.setBfiledata(rs.getBlob("bfiledata"));
				boardList.add(board);


				Blob blob = board.getBfiledata();
				if (blob!= null){
					InputStream is = blob.getBinaryStream();
					OutputStream os = new FileOutputStream("src/JAVA/Java_Lecture/About_JDBC/JDBCconnect/EX02/"+board.getBfilename());
					is.transferTo(os);
					os.flush();
					os.close();
					is.close();
				}

			}
			System.out.println("사용자 모두 출력 완료");

			for (Board board : boardList) {
				System.out.println("유저리스트 정보 : "+ board);
			}
			//PreparedStatement 닫기
			rs.close();
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



