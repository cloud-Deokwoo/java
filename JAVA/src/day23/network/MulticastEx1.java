package day23.network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MulticastEx1 {

	public static void main(String[] args) {
		// UDP Server ... DatagramSocket, DatagramPacket
		
		InetAddress multicastGroup = null;
		String multicastAddr = "230.0.0.1"; // 통신용 X
		
		
		try {
			//서버(수신측)
			// 멀티 캐스트 주소
			multicastGroup = InetAddress.getByName(multicastAddr);
			MulticastSocket socket = new MulticastSocket(9000);  //수신
			socket.joinGroup(multicastGroup);  // 멀티 캐스트 그룹 가입!
			// leaveGroup()를 사용하여 멀티 캐스트 그룹 해제!!
					
						
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
