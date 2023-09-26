package day27.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MariaDBConnect {

	public static void main(String[] args) {
		// 객체 생성
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			// 1. 드라이버 로드
			Class.forName("org.mariadb.jdbc.Driver");
			
			// 2. 데이터베이스 연결을 위한 Connection
			conn = DriverManager.getConnection(
					"jdbc:mariadb://localhost:13306/testdb", 
					"root", 
					"root1234");
			System.out.println(conn);
			System.out.println("데이터베이스 접속 성공!");
			
		} catch (ClassNotFoundException ce) {
			System.out.println("드라이버 로드 실패");
		} catch (SQLException sqle) {
			System.out.println("SQL 연동 실패!");
			System.out.println(sqle.getMessage());
		}

	}

}
