package day15.generic;

import java.awt.CardLayout;
import java.util.ArrayList;

public class GenericExample2 {

	public static void main(String[] args) {
		Wallet<Card, Money> card_wallet = new Wallet<>("파란색");
		Wallet<CreditCard,Money> card_wallet2 = new Wallet<>("하늘색");
		
//		Wallet<String,Integer> card_wallet2 = new Wallet<>("하늘색");
		// 위에 것이 안되는 이유는? 정의시 제한 걸려 있음. <One extends Card, Two extends Money>
		card_wallet.pouch.add(new CreditCard());
		card_wallet.pouch.add(new CheckCard());
		card_wallet.pouch.add(new BusCard());
//		card_wallet2.pouch.add(new CheckCard());
		card_wallet2.pouch.add(new CreditCard());
		
		card_wallet2.pouch2.add(new Dollar());
		card_wallet2.pouch2.add(new Won());
		
		

	}

}

// 제너릭에 extends는 타입의 범위를 제한하는 역할을 한다. 
// 지갑 클래스 생성... 
// - One extends Card : 첫번째 타입은 Card를 상속받는 클래스만 허용!!!
// - Two extends Money : 두번째 타입은 Money를 상속받은 클래스만 허용!!!
class Wallet<One extends Card, Two extends Money> {
	
	ArrayList<One> pouch;
	ArrayList<Two> pouch2;
	String color;
	
	public Wallet(String color) {
		pouch = new ArrayList<>();
		pouch2 = new ArrayList<>();
		this.color = color;
	}

	public One get(int index) {
		return pouch.get(index);
	}
	
	@Override
	public String toString() {
		return "지갑의 내용물을 출력합니다.";
	}
}


class Card {}

class CreditCard extends Card {}
class CheckCard extends Card {}
class BusCard extends Card {}

class Money {}
class Won extends Money {}
class Dollar extends Money {}

