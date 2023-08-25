package day07.customermanager;

import java.util.Scanner;

import day07.customermanager.oop.Customer;

public class CustomerManager {
	
	//배열에 저장할 수 있는 최대 고객의 수
	static final int MAX = 100;   
	
	// Customer 객체의 배열을 선언
	static Customer[] cusList = new Customer[MAX];
	
	//배열을 참조하기 위해서 인덱스가 필요함
	static int index = -1; // 배열은 0번부터 시작하기 때문에 최소의 인덱스는 -1이여야 합니다. 
	
	//배열의 처음 선언한 크기보다 같거나 작은 개수의 자료를 저장
	//그래서 현재 데이터가 몇개 저장되어 있는지 알 수 있는 변수를 선언
	static int count = 0; //저장 개수
	
	//기본 입력장치로부터 데이터를 입력받기 위해서 Scanner 객체 생성
	static Scanner scan = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		// 고객 관리 프로그램의 메뉴
		while(true) {
			//고객 메뉴 ui(TEXT UI)
			System.out.printf("\n[INFO] 고객 수 : %d, 인덱스 : %d\n", count, index);
			System.out.println("메뉴를 입력하세요.");
			System.out.println("(I)nsert, (P)revious, (N)ext, (C)urrent, (U)pdate, (D)elete, (Q)uit");
			System.out.print("메뉴 입력 : ");
			String menu = scan.next();
			menu = menu.toLowerCase();
			//메뉴 선택시 동작을 구현... 
			switch (menu.charAt(0)) {
			case 'i':   //insert
				System.out.println("고객 정보를 입력을 시작합니다.");
				if(count >= MAX) {
					System.out.println("더 이상 저장할 수 없습니다.");
				}else {
					insertCustomerData();
					System.out.println("고객정보를 저장했습니다.");
				}
				break;
			case 'p':   //previous
				System.out.println("이전 데이터를 출력합니다.");
				if(index <= 0) {
					System.out.println("이전 데이타가 존재하지 않습니다.");
				}else {
					index--;
					printCustomerData(index);
				}
				break;
			case 'n':	//next
				System.out.println("다음 데이터를 출력합니다.");
				if(index >= count -1) {
					System.out.println("다음 데이타가 존재하지 않습니다.");
				}else {
					index++;
					printCustomerData(index);
				}
				break;
			case 'c':	//current
				System.out.println("현재 데이터를 출력합니다.");
				if((index >= 0)&&(index < count)) {
					printCustomerData(index);
				}else {
					System.out.println("출력할 데이타가 선택되지 않았습니다.");
				}
				break;
			case 'u':	//update
				System.out.println("데이터를 수정합니다.");
				if((index>=0) && (index <count)) {
					System.out.println(index + "번째 데이터를 수정합니다.");
					updateCustomerData(index);
				}else {
					System.out.println("수정할 데이타가 선택되지 않았습니다.");
				}
				break;
			case 'd':	//delete
				System.out.println("데이터를 삭제합니다.");
				if((index >=0) && (index < count)) {
					System.out.println(index + "번째 데이터를 삭제합니다.");
					deleteCustomerData(index);
				}else {
					System.out.println("삭제할 데이타가 선택되지 않았습니다.");
				}
				break;
			case 'q':	//종료
				System.out.println("프로그램을 종료합니다.");
				scan.close();
				System.exit(0); //프로세스 종료
				break;
			default:
				System.out.println("메뉴를 잘 못 입력했습니다.");
			}
		}

	}
	
	// 고객 데이터 입력추가
	public static void insertCustomerData() {
		// 이름, 성별, 이메일, 출생년도 입력
		System.out.print("이름 : ");
		String name = scan.next();
		System.out.print("성별(M/F) : ");
		String gender = scan.next();
		System.out.print("이메일 : ");
		String email = scan.next();
		System.out.print("출생년도 : ");
		int birthYear = scan.nextInt();
		
		//고객 객체를 배열에 저장(Customer 클래스의 객체)
		Customer c1 = new Customer();
		c1.setName(name);
		c1.setGender(gender);
		c1.setEmail(email);
		c1.setBirthYear(birthYear);
		cusList[count] = c1;
		count++;   //count번째 배열에 객체를 저장한 후 count값 증가시킴.... 
	}
	
	//현재 고객 정보 출력 
	public static void printCustomerData(int index) {
		System.out.println("==========CUSTOMER INFO===============");
		System.out.println("이름 : "+nameList[index]);
		System.out.println("성별 : "+genderList[index]);
		System.out.println("이메일 : "+emailList[index]);
		System.out.println("출생년도 : "+birthYearList[index]);
		System.out.println("======================================");
	}
	
	public static void updateCustomerData(int index) {
		System.out.println("---------UPDATE CUSTOMER INFO---------");
		System.out.print("이름("+nameList[index]+") : ");
		String name = scan.nextLine();
		if(name.length() != 0) {
			nameList[index] = name;
		}
		System.out.print("성별("+genderList[index]+") : ");
		genderList[index] = scan.next();		
		System.out.print("이메일("+emailList[index]+") : ");
		emailList[index] = scan.next();
		System.out.print("출생년도("+birthYearList[index]+") : ");
		birthYearList[index] = scan.nextInt();
	}
	
	public static void deleteCustomerData(int index) {
		for(int i=index; i<count - 1;i++) {
			nameList[i] = nameList[i+1];
			genderList[i] = genderList[i+1];
			emailList[i] = emailList[i+1];
			birthYearList[i] = birthYearList[i+1];
		}
		count--;
	}
	

}
