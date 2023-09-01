package day12.exception;

import java.io.IOException;
import java.sql.SQLException;

public class Sub extends Super {
	
	//메서드 재정의 시에... .
	// 부모가 throws 하지 않은 예외에 대해서 처리할 수 없음.
//	@Override
//	public void doIt() throws SQLException {
//		System.out.println("Sub.doIt");
//		try {
//			super.doIt();
//		}catch (IOException e) {
//			throw new SQLException(e.getMessage());
//		}
//	}

}
