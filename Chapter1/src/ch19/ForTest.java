package ch19;

public class ForTest {

	public static void main(String[] args) {
		
		int count = 1;
		int sum = 0;
		
		for(int i = 0;i<10;i++, count++) {
			sum += count;
		}
		
		System.out.println(sum);
	}

}
