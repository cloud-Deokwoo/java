package day26.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBConnect2 {

	public static void main(String[] args) {
		// Select 처리... 
		
		// 객체 생성
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			// 1. JDBC 드라이버 로드 - Class.forName();
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. Connection 객체 생성 - DriverManager();  -- 여기까지... 
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/testdb?serverTimezone=Asia/Seoul",
					"root", 
					"root1234");
			
			// 3. Statement 객체 생성 - createStatment();
			stmt = conn.createStatement();
			
			// 4. SQL 작성
			String sql = "select * from Persons";
						
			// 5. Statement 객체를 통한 동작 - executeQuery() -> ResultSet 객체
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int id = rs.getInt("id");
				String firstName = rs.getString("firstName");
				String lastName = rs.getString("lastName");
				int age = rs.getInt("age");
				String city = rs.getString("city");
				
				System.out.printf("id : %d, 성 : %s, 이름 : %s, 나이 : %d, 도시 : %s \n",
						id, lastName, firstName, age, city);
			}
			rs.close();
			
			System.out.println("입력값을 이용한 검색 문제");
			// 1. 입력값을 받아서 해당 결과를 출력하세요. id
			Scanner scan = new Scanner(System.in);
			System.out.print("검색할 id를 입력하세요 : ");
			int inputId = scan.nextInt();
			
			// sql 작성
			String sql1 = "select * from Persons where id="+inputId;
			
			// sql 실행
			rs = stmt.executeQuery(sql1);
			if (rs.next()) {
				System.out.printf("id : %d, 성 : %s, 이름 : %s, 나이 : %d, 도시 : %s \n",
						rs.getInt("id"), rs.getString("lastName"), 
						rs.getString("firstName"), rs.getInt("age"),
						rs.getString("city"));
			}else {
				System.out.println("입력한 id의 결과가 없습니다.");
			}
			rs.close();
			
			System.out.println("이름 입력을 통한 내용 출력 문제");
			// 2. 이름(firstName)으로 입력값 받아서 출력. 단, 일부 입력시에도 출력!
			System.out.print("검색할 이름을 입력하세요 : ");
			String searchName = scan.next();
			
			//SQL 작성
			String sql2 = "select * from Persons where firstName like '%"+searchName+"%'";
			
			//SQL 실행
			rs = stmt.executeQuery(sql2);
			while(rs.next()) {
				int id = rs.getInt("id");
				String firstName = rs.getString("firstName");
				String lastName = rs.getString("lastName");
				int age = rs.getInt("age");
				String city = rs.getString("city");
				
				System.out.printf("id : %d, 성 : %s, 이름 : %s, 나이 : %d, 도시 : %s \n",
						id, lastName, firstName, age, city);
			}
			
		} catch (ClassNotFoundException ce) {
			System.out.println("드라이버 로드 실패");
			System.out.println(ce.getMessage());
		} catch (SQLException sqle) {
			System.out.println("SQL연동 실패");
			System.out.println(sqle.getMessage());
		} finally {
			try {
				if(conn!=null) conn.close();
				if(stmt!=null) stmt.close();
				if(rs!=null) rs.close();
			} catch (Exception e) {}
		}
		
		

	}

}
