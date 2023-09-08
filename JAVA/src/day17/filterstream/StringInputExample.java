package day17.filterstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import util.Closer;

public class StringInputExample {

	public static void main(String[] args) {
		// 한줄씩 입력 받아서 내용을 저장
		File file = new File("D:\\Develop\\Java\\JAVA\\file\\stringline.txt");
		InputStreamReader isr = null;  // 키보드 입력값 처리
		BufferedReader br = null;
		FileOutputStream fos = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		
		String inputString;
		System.out.println("저장할 내용을 입력 후 Ctrl+z를 눌러주세요.");
		try {
			isr = new InputStreamReader(System.in);  // byte -> char
			br = new BufferedReader(isr);
			
			fos = new FileOutputStream(file);        // 노드 스트림  byte
			osw = new OutputStreamWriter(fos);       // byte -> char
			bw = new BufferedWriter(osw);			
			
			while((inputString = br.readLine()) != null ) {
				bw.write(inputString+"\n");
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if(br!=null) Closer.close(br);
			if(bw!=null) Closer.close(bw);
		}

	}

}
