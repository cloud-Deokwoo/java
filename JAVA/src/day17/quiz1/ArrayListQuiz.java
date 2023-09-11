package day17.quiz1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListQuiz {

	public static void main(String[] args) {
		
		//1. User를 저장하는 List를 선언하세요
		List<User> people = new ArrayList<>();

		Scanner scan = new Scanner(System.in);

		while(true) {

			System.out.println("메뉴를 입력하세요.");
			System.out.println("[ 1. 회원 등록 | 2. 전체 회원 정보 보기 | 3. 회원정보 검색 | 4. 회원정보 삭제 | 5. 종료 ]");
			System.out.print(">>> ");
			int menu = scan.nextInt();

			if(menu == 1) {
				/*
				Scanner를통해 이름과, 나이를 입력받고 User객체에 저장합니다.
				그리고 User객체를 list에 추가하세요.
				*/
				scan.nextLine();
				System.out.println("====== 회원 정보 입력 ======");
				System.out.print("회원 이름 입력 : ");
				String name = scan.nextLine();

				System.out.print("회원 나이 입력 : ");
				int age = scan.nextInt();
				
				User user = new User(name, age);
				people.add(user);
				System.out.println("회원 정보 정상 처리");
				

			}else if(menu == 2) {
				
				System.out.println("====== 모든 회원 정보 ======");
				/*
				 * people의 길이만큼 회전하면서 people의객체를 꺼내 저장합니다. (객체의 타입에 유의)
				 * 꺼낸 하나의 객체에서  공개된 메서드를 통해 이름, 나이를 출력하세요.
				 * 
				 */
				for (int i = 0; i < people.size(); i++) {
					User user = people.get(i);
//					System.out.printf("[ 이름 : %s , 나이 : %d ]\n", user.getName(),user.getAge());
					System.out.println(user.toString());
				}
				System.out.println("==========================");


			}else if(menu == 3) {
				System.out.println("찾을 이름을 입력하세요.");
				System.out.print(">>> ");
				String name = scan.next();
				
				for(int i=0; i<people.size(); i++) {
					User p = people.get(i);
					String pName = p.getName();
					
					if(pName.equals(name)) {
						System.out.println("이름: " + name + ", 나이: " + p.getAge());
						break;
					} 
					//people List의 인덱스는 size -1이 됩니다.
					if (i == people.size() -1) {
						System.out.println(name +"님은 목록에 없습니다.");
					}
					
				}
				

			}else if(menu == 4) {
				/*
				 * 1. scan 을 통해 삭제할 이름을 입력 받으세요.
				 * 2. list 의 길이 만큼 회전하면서 객체에서 name을 꺼내 비교합니다.
				 * 3. 입력받은 이름과 동일한 이름이 있다면 people객체를 삭제
				 * 
				 */
				// 1.
				System.out.print("삭제할 이름을 입력하세요 : ");
				String deleteName = scan.nextLine();
				for(int i = 0; i < people.size(); i++) {
					//2.
					User user = people.get(i);
					String name = user.getName();
					//3.
					if(name.equals(deleteName)) {
						people.remove(i);
					}
				}

			}else if(menu == 5) {
				scan.close();
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
		}

	}

}
