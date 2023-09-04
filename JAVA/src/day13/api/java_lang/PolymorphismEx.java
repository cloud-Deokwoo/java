package day13.api.java_lang;

public class PolymorphismEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[] arrObj = new Object[10];
		
		arrObj[0] = new Byte((byte)127);
		arrObj[1] = new Short((short)32767);
		arrObj[2] = new Integer(2147483647);
		arrObj[3] = new Long(2147483648L);
//		arrObj[4] = new Float(3.5F);  //boxing
		arrObj[4] = 3.5F;    // autoboxing - 1.5이후 부터 추가된 기능
		System.out.println( ((Float)arrObj[4]).floatValue() ); // unboxing
		arrObj[5] = new Double(3.7);
//		System.out.println( ((Double)arrObj[5]).doubleValue() ); // unboxing
		arrObj[6] = new Boolean(true);
		arrObj[7] = new Character('j');
		arrObj[8] = new String("Hello World!");
		arrObj[9] = new java.util.Date();
		
		for(int i=0; i<arrObj.length;i++) {
			System.out.println(arrObj[i]);
		}
		
		int a = Integer.parseInt("100");  // 문자열 값을 기본 데이터 형으로 변경!!!
		System.out.println(a);

	}

}
