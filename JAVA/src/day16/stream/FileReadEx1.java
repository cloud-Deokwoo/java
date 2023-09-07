package day16.stream;

import java.io.File;
import java.io.FileReader;

public class FileReadEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("D:\\Develop\\Java\\JAVA\\file\\w.txt");
		
		FileReader in = null;
		try {
			in = new FileReader(f);   
			while(true) {
				int data = in.read();
//				System.out.printf("%X",data);
				System.out.print((char)data);
				if(data == -1) {
					break;
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {in.close();} catch (Exception e2) {e2.printStackTrace();}
		}

	}

}
