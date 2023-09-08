package util;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class Closer {
	
	private Closer() {}  //생성자!
	
	public static void close(InputStream in) {
		try {
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void close(OutputStream out) {
		try {
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void close(Writer w) {
		try {
			w.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void close(Reader r) {
		try {
			r.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
