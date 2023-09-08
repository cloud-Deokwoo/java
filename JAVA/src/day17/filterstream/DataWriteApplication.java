package day17.filterstream;

import java.io.*;

import util.Closer;

public class DataWriteApplication {

	public static void main(String[] args) {

		// 파일 객체
		File file = new File("D:\\Develop\\Java\\JAVA\\file\\customer.data");
		// 노드 스트림
		FileOutputStream fos = null;
		// 필터 스트림 - Data
		DataOutputStream dos = null;
		try {
			fos = new FileOutputStream(file);
			dos = new DataOutputStream(fos);
			// DataInput/OutputStream은 데이터를 순서대로 추가... 불러올 때도 순서대로 불러야함. 
			dos.writeUTF("홍길동"); dos.writeChar('M');
			dos.writeUTF("hkd@test.com"); dos.writeInt(30);
			dos.writeUTF("홍길남"); dos.writeChar('F');
			dos.writeUTF("hkn@test.com"); dos.writeInt(25);
			System.out.println("File Saved!");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(dos!=null) Closer.close(dos);
			if(fos!=null) Closer.close(fos);
		}

	}

}
