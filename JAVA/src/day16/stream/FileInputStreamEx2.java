package day16.stream;

import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputStreamEx2 {
	
	public static void main(String[] args) {
		
		
		InputStream fis = null;
		try {
			//입력 스트림 객체 생성
			fis = new FileInputStream("D:\\Develop\\Java\\JAVA\\file\\test.txt");
			
			//입력한 데이터를 저장할 변수 선언
			byte[] buffer = new byte[256];
			int readCount = fis.read(buffer); // 처음 블록을 읽기... 
			while (readCount != -1) {  // -1이 아니면 데이터 있다는 의미...
				String data = new String(buffer, 0, readCount);
				System.out.print(data);
				readCount = fis.read(buffer); // 다음 블록을 읽기
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try { fis.close();} catch (Exception e2) {e2.printStackTrace();}
		}
		
		
		
		
		
		
	}

}
