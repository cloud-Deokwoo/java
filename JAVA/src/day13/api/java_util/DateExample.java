package day13.api.java_util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		
		Date date = new Date();
		
		System.out.println(date.toString());
		
		//특정 문자열 포맷으로 얻어내고 싶은 경우... SimpleDateFormat 클래스 사용
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm문 ss초");
		// hh - 12시간, HH-24시간
		String time = sdf.format(date);
		System.out.println(time);
				
		sdf = new SimpleDateFormat("yy-MM-dd a hh:mm:ss");
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("오늘은 E요일입니다. 오늘은 1년 중 D번째 날입니다.");
		System.out.println(sdf.format(date));
		
		
		
		
		

	}

}
