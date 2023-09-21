package day26.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PersonsDAO {
	
	// DAO 클래스 (Data Access Object Class)
	// - 데이터베이스에 접속해서 데이터의  CRUD 등의 작업을 하는 클래스입니다.
	// - 일반적으로 다른 프로그램 로직 위에서 동작하기도 하지만 별도의 DAO클래스를 만들어 사용하기도 합니다. 
	//    -> 유지보수 및 코드의 모듈화를 위해서... 
	// - 보통 한 개의 테이블마다 한 개의 DAO를 작성합니다. 
	// - DAO 클래스는 테이블로부터 데이터를 읽어와 자바 객체로 변환하거나 자바 객체의 값을 테이블에 저장합니다.
	// - 때문에 DAO를 구현하면 테이블의 컬럼과 매핑되는 값을 가지고 있는 클래스를 항상 작성해야 합니다. 
	//   이것을 VO클래스라고 합니다. 
	
	// 멤버 변수 - 필드, 속성
	// Connection 객체 생성을 위한 값
	private String url = "jdbc:mysql://localhost:3306/testdb?serverTimezone=Asia/Seoul";
	private String user = "root";
	private String password = "root1234";
	
	// 데이터 접속을 위한 객체 
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
		
	// 생성자 - Connection 객체 생성
	public PersonsDAO() {
		try {
			// 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Connection 객체 생성
			conn = DriverManager.getConnection(url, user, password);  //SQL
			
		} catch (ClassNotFoundException ce) {
			System.out.println("드라이버 로드 실패");
			System.out.println(ce.getMessage());
		} catch (SQLException sqle) {
			System.out.println("SQL 연동 실패");
			System.out.println(sqle.getMessage());
		}
	}
	
	
	// 메서드 (CRUD)
	
	// 데이터 입력 메서드 구현
	public int insert(PersonsVO vo) {
		int result = 0;
		
		//SQL 작성
		String sql = "insert into Persons (lastName, firstName, age, city)"
				+ "values('"+vo.getLastName()+"','"+vo.getFirstName()+"',"+
				vo.getAge()+",'"+vo.getCity()+"')";
		try {
			//Statement 객체 생성
			stmt = conn.createStatement();	
			//SQL 실행
			result = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println("SQL 연동 에러");
			System.out.println(e.getMessage());
		} finally {
			try {
				if(conn!=null) conn.close();
				if(stmt!=null) stmt.close();
			} catch (Exception e2) {}
		}
		return result; // 실행 결과 반환
	}
	
	
	
	

}
