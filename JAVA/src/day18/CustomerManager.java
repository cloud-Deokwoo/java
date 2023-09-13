package day18;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import util.Closer;

public class CustomerManager {
	
	static ArrayList<Customer> cuslist = new ArrayList<>();  //고객 데이터를 저장
	static Scanner scan = new Scanner(System.in);
	static File file = new File("D:\\Develop\\Java\\JAVA\\file\\CustomerManager.txt");

	public static void main(String[] args) {
		readCustomerData();// 프로그램 시작전에 정보를 입력 받아야 함!!!
		while(true) {
			System.out.printf("\n[INFO] 고객 수 : %d", cuslist.size());
			System.out.println("\t\t 메뉴를 입력하세요.");
			System.out.println("(I)nsert, (W)rite, (S)elect, Select(A)ll, (U)pdate, (D)elete, (Q)uit");
			System.out.print("메뉴 입력 : ");
			String menu = scan.next();
			menu = menu.toLowerCase(); //대소문자 구분 X
			switch (menu.charAt(0)) {
			case 'i':
			case 'ㅑ':
				System.out.println("고객정보 입력을 시작합니다.");
				//고객 정보 입력 처리.. insertCustomerData()
				insertCustomerData();
				System.out.println("고객 정보를 저장했습니다.");
				break;
			case 'w':
			case 'ㅈ':
				System.out.println("고객정보를 파일에 저장합니다.");
				//고객 정보 파일 저장처리.. writeCustomerData()
				writeCustomerData();
				break;
			case 's':
			case 'ㄴ':
				System.out.println("고객정보을 출력합니다.");
				//고객 정보 출력 처리.. printCustomerData(Customer customer)
				if((cuslist.size() > 0)) {
					printCustomerData(selectCustomerData());
				}else {
					System.out.println("출력할 데이터가 없습니다.");
				}
				break;
			case 'a':
			case 'ㅁ':
				System.out.println("전체 데이터를 출력합니다.");
				//고객 정보 전체출력 처리.. printAllCustomerData()
				if(cuslist.size() > 0) {
					printAllCustomerData();
				}else {
					System.out.println("출력할 데이터가 없습니다.");
				}
				break;
			case 'u':
			case 'ㅕ':
				System.out.println("고객정보를 수정합니다.");
				//고객 정보 수정 처리.. updateCustomerData()
				if(cuslist.size() > 0) {
					updateCustomerData(selectCustomerData());
				}else {
					System.out.println("수정할 고객정보가 없습니다.");
				}
				break;
			case 'd':
			case 'ㅇ':
				System.out.println("고객정보를 삭제합니다.");
				//고객 정보 삭제 처리.. deleteCustomerData()
				if(cuslist.size() > 0) {
					deleteCustomerData(selectCustomerData());
				}else {
					System.out.println("삭제할 고객정보가 없습니다.");
				}
				break;
			case 'q':
			case 'ㅂ':
				System.out.println("프로그램을 종료합니다.");
				scan.close();
				System.exit(0);				
				
			default:
				System.out.println("메뉴를 잘 못 입력했습니다.");
				break;
			}
		}

	}
	
	public static void insertCustomerData() {
		// Customer 데이터를 추가
		System.out.println("이름 : ");
		String name = scan.next();
		System.out.println("성별(M/F) : ");
		String gender = scan.next();
		System.out.println("이메일 : ");
		String email = scan.next();
		System.out.println("출생년도 : ");
		int birthYear = scan.nextInt();
		Customer c1 = new Customer(name, gender, email, birthYear);
		for(Customer c : cuslist) {  //중복관련 내용. 클래스에 hashCode와 equals 수정작업!
			if(c.equals(c1)) {
				System.out.println("중복 데이터 입니다.");
				return;
			}
		}
		cuslist.add(c1);
		
		
	}
	
	public static Customer selectCustomerData() {
		while(true) {
			System.out.println("출력, 수정 또는 삭제할 사람의 이름을 입력해주세요.");
			System.out.println("또는 메뉴로 돌아가고 싶으면 q를 눌러주세요.");
			String name = scan.next();
			Customer cus = new Customer();
			for(int i=0; i<cuslist.size(); i++) {
				if(cuslist.get(i).getName().equals(name)) {
					return cuslist.get(i);
				}
			}
			if(name.equals("q") || name.equals("Q")||name.equals("ㅂ")) {
				return cus;
			}
			System.out.println("입력하신 이름을 가진 데이터가 존재하지 않습니다.");
		}
		
	}
	
	public static void printCustomerData(Customer customer) {
		if(customer.getName() == null) {
			System.out.println("메뉴로 돌아갑니다.");
		}else {
			System.out.println(customer.toString());
		}
		
	}
	
	public static void printAllCustomerData() {
		int i = 0;
		while(i<=cuslist.size()-1) {
			System.out.println(cuslist.get(i).toString());
			i++;
		}
		System.out.println("전체 데이터  출력을 완료했습니다.");		
	}
	
	public static void updateCustomerData(Customer customer) {
		if(customer.getName() == null) {
			System.out.println("메뉴로 돌아갑니다.");
		}else {
			System.out.println("-------------- UPDATAE CUSTOMER INFO ----------------");
			System.out.print("이름("+customer.getName()+") : ");
			customer.setName(scan.next());
			
			System.out.print("성별("+customer.getGender()+") : ");
			customer.setGender(scan.next());
			System.out.print("이메일("+customer.getEmail()+") : ");
			customer.setEmail(scan.next());
			System.out.print("출생년도("+customer.getBirthYear()+") : ");
			customer.setBirthYear(scan.nextInt());
		}
		
	}
	
	public static void deleteCustomerData(Customer customer) {
		if(customer.getName() == null) {
			System.out.println("메뉴로 돌아갑니다.");
		}else {
			cuslist.remove(customer);
			System.out.println("데이터가 삭제되었습니다.");
		}
		
	}
	
	public static void writeCustomerData() {
		
		if(file.exists()) {
			System.out.println("파일이 존재합니다.");
		}else {
			System.out.println("파일이 없습니다.");
			File dir = new File(file.getParent());
			dir.mkdirs();
		}
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(cuslist);
			System.out.println("Customer 데이터 저장 완료");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if(oos != null) Closer.close(oos);
			if(fos != null) Closer.close(fos);
		}
	}
	
	@SuppressWarnings("unchecked")
	public static void readCustomerData() {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			cuslist = (ArrayList<Customer>)ois.readObject();
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			if(ois != null) Closer.close(ois);
			if(fis != null) Closer.close(fis);
		}
	}

}
