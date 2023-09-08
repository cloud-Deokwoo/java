package day17.filterstream;

import java.io.File;
import java.io.FileOutputStream;

public class TextWriterApplication {

	public static void main(String[] args) {
		String data1 = "홍길동,M,hkd@test.com,30";  //","는 필드, 컬럼 구분자!
		String data2 = "홍길남,F,hkn@test.com,25";  // "\n"행 즉, 레코드 구분자!
		
		File f = new File("D:\\Develop\\Java\\JAVA\\file\\"+"customer.txt");
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(f);
			fos.write(data1.getBytes());
			fos.write('\n');  //레코드 구분자!
			fos.write(data2.getBytes());
			System.out.println("File saved!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			if(fos!=null) try {fos.close();} catch (Exception e2) {}
		}

	}

}
