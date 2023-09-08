package day17.filterstream;

import java.io.*;

public class FilterStreamExample {

	public static void main(String[] args) {
		
		FileReader input = null;
		FileWriter output = null;
		BufferedReader bufInput = null;
		BufferedWriter bufOuput = null;
		
		try {
			String inFile = "D:\\Develop\\Java\\JAVA\\file\\test.txt";
			String outFile = "D:\\Develop\\Java\\JAVA\\file\\test_out.txt";
			
			//필터 스트림은 대상이 노드 스트림을 대상
			//노드 스트림... 
			input = new FileReader(inFile);
			output = new FileWriter(outFile);
			//필터 스트림...
			bufInput = new BufferedReader(input);
			bufOuput = new BufferedWriter(output);
			
			String line;
			line = bufInput.readLine();  //문자열에 "\n"을 만날때까지 입력. 없으면 null 반환
			System.out.println(line);
			while(line != null) {
				bufOuput.write(line, 0, line.length());
				bufOuput.newLine();  //줄바꿈 +"\n"을 입력한 것과 같음
				line = bufInput.readLine();
			}
			System.out.println(inFile +"  >>  "+outFile);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(bufInput != null)
				try {bufInput.close();} catch (Exception e2) {}
			if(bufOuput != null)
				try {bufOuput.close();} catch (Exception e2) {}
		}

	}

}
