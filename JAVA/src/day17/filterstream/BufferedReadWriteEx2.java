package day17.filterstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReadWriteEx2 {

	public static void main(String[] args) {
		// 작성된 텍스트를 저장 읽어오기
		String htmlCode ="<html><head><style>\n";
		htmlCode += "div { \n"
				+ "		widht: 100px; \n"
				+ "		height: 100px; \n"
				+ "		color: white; \n"
				+ "		background: red; \n"
				+ "		padding: 50px; \n"
				+ "		font-size: 30px; \n"
				+ "}\n";
		htmlCode += "</style></head><body>";
		htmlCode += "<div>Hello HTML!</div>";
		htmlCode += "</body></html>";
		
		String path = "D:\\Develop\\Java\\JAVA\\file\\index.html";
		write(path, htmlCode);
		
		System.out.println(read(path));	
		
	}
	
	public static String read(String path) {
		// String read(path)
		File f = new File(path);
		
		FileReader fr = null;
		BufferedReader br = null;
		String code = null;
		try {
			code = new String();
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			
			String line = null;
			while((line = br.readLine())!= null) {
				System.out.println(line);
				code += line;
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(br!=null)
				try {br.close();} catch (Exception e2) {}
			if(fr!=null)
				try {fr.close();} catch (Exception e2) {}
		}
//		System.out.println(code);
		return code;
	}
	
	public static void write(String path, String code) {
		//write(path, htmlCode)
		File f = new File(path);
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		// bufferedWriter가 flush를 호출 경우!!
		// 1. 설정한 버퍼가 가득 찼을 때
		// 2. flush()를 호출했을 때
		// 3. close()를 할 때
		
		try {
			fw = new FileWriter(f);  //노드 스트림
			bw = new BufferedWriter(fw); //필터 스트림
			
			bw.write(code);	
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(bw != null)
				try {bw.close();} catch (Exception e2) {}
			if(fw != null)
				try {fw.close();} catch (Exception e2) {}
		}
	}
	
	

}
