package day16.quiz;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class FileQuiz {

	public static void main(String[] args) {
		File file = new File("D:\\filetest4\\서시.txt");
		File dir = new File("D:\\filetest5\\testFile\\temp");
		File dstFile = null;
		
		System.out.println("서시.txt는 파일인가요? "+file.isFile());
		System.out.println("dir이 존재하나요? "+dir.exists());
		if(dir.exists()) {
			dstFile = new File(dir.getPath()+"\\"+file.getName());
			file.renameTo(dstFile);
		}else {
			System.out.println("디렉터리가 존재하지 않습니다.");
			dir.mkdirs();
			System.out.println("디렉터리를 생성합니다.");
			dstFile = new File(dir.getPath()+file.getName());
			file.renameTo(dstFile);
		}
//		System.out.println(dstFile);
		Reader rFile = null;
		try {
			rFile = new FileReader(dstFile);
			while(true) {
				int data = rFile.read();
				System.out.print((char)data);
				if (data == -1)
					break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rFile.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
