package day19.lamda;

public class LambdaEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LambdaInterface li = () -> {
			String str = "메서드 출력";
			System.out.println(str);
		};
		
		li.print();

	}

}

interface LambdaInterface{
	void print();
//	void print2();   //에러 발생.. 왜? 함수적 인터페이스가 아니니까.... 
}
