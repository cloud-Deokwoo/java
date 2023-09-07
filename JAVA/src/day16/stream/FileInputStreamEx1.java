package day16.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream fis = null;
		
		try {
			//FileInputStream(읽을 파일의 경로)
			fis = new FileInputStream("D:\\Develop\\Java\\JAVA\\file\\test.txt");
			byte[] buffer = new byte[100];
			String content = "";
			while(true) {
//				int data = fis.read();
//				System.out.print((char)data);  //read() 1바이트 씩 읽기.. char 2바이트
				
				int data = fis.read(buffer); 
				System.out.println(data);
				if (data != -1) content = new String(buffer, 0, data);
				else break;
//				if(data == -1)  // data가 -1인 경우는 더이상 데이터가 없는 경우
//					break;
				System.out.println(content);
			}
			
		} catch (FileNotFoundException fe) {
			System.out.println("해당 경로의 파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			System.out.println("파일을 읽을 수 없습니다.");
		} finally {
			try {
				fis.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
