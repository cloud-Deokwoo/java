package day26.dbconnect;

import java.util.Scanner;

public class DBConnectMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		PersonsDAO dao = new PersonsDAO();
		PersonsVO vo = new PersonsVO();
		
		System.out.println("Persons 정보 입력(Insert) : ");
		System.out.print("성 입력 : ");
		vo.setLastName(scan.next());
		System.out.print("이름 입력 : ");
		vo.setFirstName(scan.next());
		System.out.print("나이 입력 : ");
		vo.setAge(scan.nextInt());
		System.out.print("도시 입력 : ");
		vo.setCity(scan.next());
	
		// SQL 동작 여부확인!
		int result = dao.insert(vo);
		if(result != 0) {
			System.out.println("SQL 입력 성공");
		}else {
			System.out.println("SQL 실패!");
		}
		
		scan.close();
	}

}
