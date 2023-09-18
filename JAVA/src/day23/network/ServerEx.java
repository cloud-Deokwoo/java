package day23.network;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {

	public static void main(String[] args) {
		// 서버
		
		// 소켓 생성
		ServerSocket server = null;
		
		try {
			server = new ServerSocket(9999);
			
			// 무한 반복 (클라이언트 접속 대기)
			while(true) {
				System.out.println("클라이언트 접속 대기");
				Socket client = server.accept();   // 대기 중!!!
				System.out.println("스레드 생성");
				HttpThread ht = new HttpThread(client);
				ht.start();	
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				server.close();
			} catch (Exception e2) {
				System.out.println(e2.getMessage());
			} 
		}

	}

}



class HttpThread extends Thread {
	
	// 필드 - 멤버 변수
	private Socket client;
	BufferedReader br;  // client 요청 정보
	PrintWriter pw;     // 서버측 전송정보 
	
	
	// 생성자
	public HttpThread(Socket client) {
		this.client = client;
		try {
			br = new BufferedReader(
					new InputStreamReader(client.getInputStream()));
			pw = new PrintWriter(client.getOutputStream());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Override
	public void run() {
		BufferedReader fbr = null;
		DataOutputStream outToClient = null;
		try {
			String line = br.readLine();
			// line : GET / HTTP/1.1  -> start line
			System.out.println("Http Header : "+line);
			int start = line.indexOf("/") + 1;
			int end = line.lastIndexOf("HTTP") - 1;
			String fileName = line.substring(start,end);
			if(fileName.equals("")) {
				fileName="index.html";
			}
			System.out.println("사용자 요청 파일 : "+fileName);
			fbr = new BufferedReader(new FileReader(fileName));
			String fileLine = null;
			pw.println("HTTP/1.0 200 Document Follow \r\n");
			while((fileLine = fbr.readLine())!=null) {
				pw.println(fileLine);
				pw.flush();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if(br != null) br.close();
				if(pw != null) pw.close();
				if(client != null) client.close();
			} catch (IOException e2) {
				System.out.println(e2.getMessage());
			}
		}
		
	}	
	
}
