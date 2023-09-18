package day23.network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {

	public static void main(String[] args) {
		// UDP Server ... DatagramSocket, DatagramPacket
		try {
			DatagramSocket socket = new DatagramSocket(9500);  //수신
			DatagramPacket inPacket;
			byte[] inMsg = null;
			
			while(true) {
				//데이터를 받기 위한 바이트 배열 생성
				inMsg = new byte[1024];
				
				// DatagramPacket 객체 생성
				inPacket = new DatagramPacket(inMsg, inMsg.length);
				
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
