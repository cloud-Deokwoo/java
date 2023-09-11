package day17.quiz2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PhoneBook {
	
	// HashMap을 이용해 전화번호부를 구현해 보세요
	
	// 1. "그룹/전화번호/이름'을 저장해야 합니다.
	// 2. 그룹을 키값으로 넣으면 그 그룹에 해당하는 HashMap이 선택됩니다. 
	// 3. 그룹의 HashMap에 전화번호를 키값으로 넣으면 이름이 나온다
	HashMap<String, HashMap<String, String>> phoneBook;
	
	public PhoneBook() {
		phoneBook = new HashMap<>();
	}
	
	// ####메서드####
	// 1. phoneBook에 새로운 그룹을 추가하는 메서드
	public void addGroup(String groupName) {
		if(!phoneBook.containsKey(groupName)) {
			phoneBook.put(groupName, new HashMap<String, String>());
		}
	}
	// 2. phoneBook의 모든 목록을 한번에 출력해주는 메서드
	public void printAll() {
		
		Set<String> groupNames = phoneBook.keySet();
		
		for(String groupName: groupNames) {
			System.out.println("* * * * "+groupName+" * * * *");
			
			//전화번호 이름
			HashMap<String, String> numberAndNames = phoneBook.get(groupName);
			if(numberAndNames.size() == 0) {
				System.out.println("비어 있음");
			}else {
				for(String number: numberAndNames.keySet()) {
					System.out.printf("%s : %s\n", numberAndNames.get(number),number);
				}
			}
		}
	}
	// 3. 이미 존재하는 그룹에 전화번호를 추가하는 메서드(그룹이 없으면 추가 못함)
	//    (> 모든 전화번호를 HashSet형태로 반환 및 중복 체크 기능도 있어야 함)
	public addPhMessage addPhoneNo(String groupName, String number, String name) {
		if(!phoneBook.containsKey(groupName)) {
			return new addPhMessage("없는 그룹니다.", addPhMessage.NOT_EXISTING_GROUP);
		}else {
			HashMap<String, String> numberAndNames = phoneBook.get(groupName);
			
			if(checkDupleNumber(number)) {
				return new addPhMessage("이미 등록된 번호입니다. 수정하겠습니까? ", 
						addPhMessage.EXISTING_NUMBER);
			}
			
			numberAndNames.put(number, name);
			return new addPhMessage("정상적으로 등록되었습니다.", addPhMessage.ADD_SUCCESS);
		}
	}
	
	// 모든 전화번호를 HashSet형태로 반환하는 메서드
	private Set<String> getAllNumber() {
		HashSet<String> allNumbers = new HashSet<>();
		
		for(HashMap<String, String> group : phoneBook.values()) {
			allNumbers.addAll(group.keySet());
		}
		return allNumbers;
	}
	
	// 전화번호 중복 체크 메서드
	private boolean checkDupleNumber(String number) {
		return getAllNumber().contains(number);
	}
	// 4. 전화번호의 일부를 입력하면 입력한 부분과 일치하는 모든 사람의 목록을 출력하는 메서드
	// 5. 이름을 입력하면 해당하는 사람의 전화번호를 모두 출력하는 메서드(동명이인이 있는 경우 여러개 출력)
	// *** 변경된 내용이 파일에 저장되어 프로그램을 다시 실행할 때도 유지되도록 만들어 주세요.!!!
	
}


class addPhMessage {
	String msg;
	int type;
	
	final static int NOT_EXISTING_GROUP = 0;
	final static int EXISTING_NUMBER = 1;
	final static int ADD_SUCCESS = 2;
	
	public addPhMessage(String msg, int type) {
		this.msg = msg;
		this.type = type;
	}
	
	@Override
	public String toString() {
		return msg;
	}
}




