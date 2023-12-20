package ch13;

import java.io.IOException;

public class SystemInTest1 {

	public static void main(String[] args) {

		System.out.println("알파벳 여러개를 쓰고 [Enter]를 누르시오");
		
		int i;
		
		try {
			i = System.in.read();
			System.out.println(i);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
