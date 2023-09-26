package day27.dbquiz;

import java.util.List;
import java.util.Scanner;

public class PersonDBMain {

	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		while(true) {
			System.out.println("[PersonsDB 처리 프로그램]");
			System.out.println("1. 전체 조회");
			System.out.println("2. 선택 조회");
			System.out.println("3. 레코드 추가");
			System.out.println("4. 레코드 수정");
			System.out.println("5. 레코드 삭제");
			System.out.println("0. 종료");
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			switch (sel) {
			case 1: // 전체 조회 
				selectAll();
				break;
			case 2: // 선택조회
				selectOne();
				break;
			case 3: // 레코드 추가
				insert();
				break;
			case 4: // 레코드 수정
				update();
				break;
			case 5: // 레코드 삭제
				delete();
				break;
			case 0: // 종료
				System.out.println("프로그램 종료");
				System.exit(0);
			default:
				System.out.println("잘못된 값을 입력했습니다.");
				break;
			}
		}

	}
	
	static void selectAll() {
		PersonsDAO dao = new PersonsDAO();
		List<PersonsVO> list = dao.selectAll();
		for(PersonsVO vo : list) {
			System.out.println(vo);
		}
	}
	
	static void selectOne() {
		PersonsDAO dao = new PersonsDAO();
		System.out.print("출력할 레코드의 ID를 입력하세요 : ");
		PersonsVO vo = dao.selectOne(scan.nextInt());
		System.out.println(vo);		
	}
	
	static void insert() {
		PersonsDAO dao = new PersonsDAO();
		PersonsVO vo = new PersonsVO();
		System.out.println("레코드 추가하기!!!");
		
		System.out.print("lastName(성) 입력 : ");
		vo.setLastName(scan.next());
		System.out.print("firstName(이름) 입력 : ");
		vo.setFirstName(scan.next());
		System.out.print("age(나이) 입력 : ");
		vo.setAge(scan.nextInt());
		System.out.print("city(도시) 입력 : ");
		vo.setCity(scan.next());
		
		int result = dao.insertPersons(vo);
		if(result != 0) {
			System.out.println("레코드 추가를 성공했습니다.");
		}else {
			System.out.println("레코드 추가를 실패했습니다.");
		}
	}
	
	static void update() {
		System.out.println("레코드 수정하기!!!");
		PersonsDAO dao = new PersonsDAO();
		System.out.print("수정할 레코드 id 입력하세요 : ");
		PersonsVO vo = dao.selectOne(scan.nextInt());
				
		System.out.printf("lastName("+vo.getLastName()+") 수정 : ");
		vo.setLastName(scan.next());
		System.out.printf("firstName("+vo.getFirstName()+") 수정 : ");
		vo.setFirstName(scan.next());
		System.out.printf("age("+vo.getAge()+") 수정 : ");
		vo.setAge(scan.nextInt());
		System.out.printf("city("+vo.getCity()+") 수정 : ");
		vo.setCity(scan.next());
		
		PersonsDAO dao2 = new PersonsDAO();
		int result = dao2.updatePersons(vo);
		if(result != 0) {
			System.out.println("레코드 수정 성공했습니다.");
		}else {
			System.out.println("레코드 수정 실패했습니다.");
		}
		
	}
	
	static void delete() {
		PersonsDAO dao = new PersonsDAO();
		System.out.print("삭제할 레코드 ID를 입력하세요 : ");
		dao.deletePersons(scan.nextInt());
		System.out.println("삭제했습니다.");
	}
	
	
	

}
