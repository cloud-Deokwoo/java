package day23.network;

import java.net.URL;
import java.net.URLConnection;

public class URLConnectionEx {

	public static void main(String[] args) {
		// URLConnection 예제
		
		URL url = null;
		String address = "https://www.egovframe.go.kr/EgovIntro.jsp?mene=1&submenu=1";
		
		try {
			url = new URL(address);
			URLConnection conn = url.openConnection();
			System.out.println("conn.toString() : "+conn);
			System.out.println("getAllowUserInteraction() : "+conn.getAllowUserInteraction());
			System.out.println("getConnectTimeout() : "+conn.getConnectTimeout());
			System.out.println("getContent() : "+conn.getContent());
			System.out.println("getContentEncoding() : "+conn.getContentEncoding());
			System.out.println("getContentLength() : "+conn.getContentLength());
			System.out.println("getContentType() : "+conn.getContentType());
			System.out.println("getDate() : "+conn.getDate());
			System.out.println("getDefaultUseCaches() : "+conn.getDefaultUseCaches());
			System.out.println("getDoInput() : "+conn.getDoInput());
			System.out.println("getDoOutput() : "+conn.getDoOutput());
			
			System.out.println("getExpiration() : "+conn.getExpiration());
			System.out.println("getHeaderFields() : "+conn.getHeaderFields());
			
			System.out.println("getIfModifiedSince() : "+conn.getIfModifiedSince());
			System.out.println("getLastModifyed() : "+conn.getLastModified());
			
			System.out.println("getReadTimeout() : "+conn.getReadTimeout());
			System.out.println("getURL() : "+conn.getURL());
			System.out.println("getUseCaches() : "+conn.getUseCaches());
			
			
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
