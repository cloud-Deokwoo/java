package day17.filterstream.serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import util.Closer;

public class ReadCustomerExample {

	public static void main(String[] args) {
		File file = new File("D:\\Develop\\Java\\JAVA\\file\\customer.ser");
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			
			Customer cus1 = (Customer)ois.readObject();
			Customer cus2 = (Customer)ois.readObject();
			@SuppressWarnings("unchecked")
			ArrayList<Customer> list = (ArrayList<Customer>)ois.readObject();
			System.out.println(cus1);
			System.out.println(cus2);
			System.out.println(list);
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		finally {
			if(ois != null) Closer.close(ois);
			if(fis != null) Closer.close(fis);
		}

	}

}
