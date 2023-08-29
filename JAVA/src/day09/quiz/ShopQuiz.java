package day09.quiz;

public class ShopQuiz {

	public static void main(String[] args) {
		// Test
		Buyer b1 = new Buyer();
		b1.cash = 500000;
//		b1.addToCart(new Coffee(10000, "이디야 원두"));
//		b1.addToCart(new Coffee(15000, "커피빈 원두"));
//		b1.addToCart(new Coffee(20000, "스타벅스 원두"));
		
		
		

	}

}


class Buyer {
	/*
	 *  Buyer의 인스턴스 변수(상태)
	 *   필요한 만큼 사용해보세요. 
	 */
	int cash;
	
	// 트렁크 관련 변수
	final int MAX_TRUNK_SIZE = 20;
	Product[] trunk = new Product[MAX_TRUNK_SIZE];
	int t_index = 0;
	
	// 카트 관련 변수
	final int INIT_CART_SIZE = 3;
	Product[] cart = new Product[INIT_CART_SIZE];
	int c_index = 0;
	
	/*
	 * 	Buyer의 기능(method)
	 *  1. 메서드명 : buy
	 *     기능 : 지정한 물건(Product)을 구입한다.
	 *       바이어의 돈(cash)에서 물건의 가격을 빼고, 
	 *       내 트렁크(trunk)에 담는다
	 *       만약 가진 돈이 부족하다면 구매할 수 없다. 
	 *     리턴타입 : 없음
	 *     매개변수 : Product p
	 * 
	 */
	
	/*
	 *  2. 메서드 명 : buyAll
	 *     기능 : 장바구니(cart)에 지정된 모든 물건을 구매(buy)한다.
	 *     리턴타입 : 없음
	 *     매개변수 : 없음, Product[] cart
	 *  
	 */
	
	
	/*
	 * 	3. 메서드 명 : addToCart
	 *     기능 : 지정한 물건을 장바구니에 담는다
	 *          만약에 장바구니에 담을 공간이 부족하면
	 *          장바구니 배열의 크기를 2배로 늘린 다음에 담는다.
	 *     리턴타입 : 없음
	 *     매개변수 : Product p
	 */
	
	/*	4. 메서드 명 : cancel
	 *     기능 : 지정한 물건을 장바구니에서 뺀다. 
	 *         뺀 곳에는 다시 물건을 담을 수 있어야 한다.
	 *     리턴타입 : 없음
	 *     매개변수 : int cart_index
	 */
	
	/*  5. 매서드명 : receipt
	 * 	     기능 : 바이어가 구매한 물건의 목록과 사용금액 남은 금액을 출력한다. 
	 *     리턴타입, 매개변수 : 없음
	 */
	
}

/*	Product 클래스를 상속받아서 상품을 3개 이상 만들어 보세요!!!
 *  (단, Product 클래스를 변경하면 안됨!!!!)
 */
class Product{  // 부모 클래스 사용할 예정!!
	
	String name;
	private int price; // private : 내 클래스 내부에서만 사용하려고 함.
	public Product(int price) {
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
}











