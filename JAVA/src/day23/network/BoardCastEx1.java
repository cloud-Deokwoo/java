package day23.network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class BoardCastEx1 {
	
	// 브로드 캐스트 
	// 네트워크 내에 있는 모든 장비에게 메시지를 전달하는 통신 방식... 

	public static void main(String[] args) {
		// UDP Server ... DatagramSocket, DatagramPacket
		try {
			//서버(수신측)
			DatagramSocket socket = new DatagramSocket(9000);  //수신
			socket.setBroadcast(true);  //브로드 캐스트를 사용하기 위한 설정!!!
						
			DatagramPacket inPacket;
			byte[] inMsg = null;
			
			while(true) {
				//데이터를 받기 위한 바이트 배열 생성
				inMsg = new byte[1024];
				
				// DatagramPacket 객체 생성
				inPacket = new DatagramPacket(inMsg, inMsg.length);  //1024 크기 데이터 처리
				
				// 패킷 데이터 수신
				socket.receive(inPacket);
				// 문자열로 저장
				String msg = new String(inMsg, 0, inPacket.getLength());
				System.out.println("클라이언트 메시지 : "+msg);
				
				//클라이언트 아이피
				InetAddress address = inPacket.getAddress();
				//클라이언트 포트
				int port = inPacket.getPort();
				System.out.println("클라이언트 주소 : "+address);
				System.out.println("클아이언트 포트번호 : "+port);	
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
