package day20.stream;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;

public class DirectoryToStream {

	public static void main(String[] args) {
		// list() 메서드를 이용하여 스트림 생성하기 
		
		try {
			System.out.println("list() 메서드를 이용하여 스트림 생성하기");
			// src 디렉터리로 Path 객체 생성
			Path path = Paths.get("src");
			// src 경로의 모든 디렉터리와 파일 Stream 객체로 생성
			Stream<Path> sr1 = Files.list(path);
			sr1.forEach(p -> System.out.println(p.getFileName()));
			
			System.out.println("find() 메서드를 이용해서 스트림 생성하기");
			// src 디렉토리를 시작으로 특정 단계까지 디렉터리 깊이로 탐색... 
			Stream<Path> sr2 = Files.find(path, 10, (p,  BasicFileAttributes)-> {
				File file = p.toFile();
				// 디렉터리가 아니고, 파일 이름에 Stream이 포함된 파일명
				return !file.isDirectory() && file.getName().contains("Stream");
			});
			sr2.forEach(p -> System.out.println(p.getFileName()));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
