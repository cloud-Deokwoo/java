package day20.stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileToStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			// Paths.get() 메서드 사용
			Path path = Paths.get("src/day20/stream/StrToStream.java");
			Stream<String> stream = 
					Files.lines(path, Charset.defaultCharset());
			stream.forEach(s -> System.out.println(s));
			stream.close();
			System.out.println();
			
			//BufferedReader의 lines() 메서드(반환 타입 : Stream<String>) 이용
			File file = path.toFile();
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			br.lines().forEach(s -> System.out.println(s));
			br.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

}
