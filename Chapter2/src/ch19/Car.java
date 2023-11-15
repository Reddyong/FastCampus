package ch19;

public class Car {
	
	private static int realNum = 10000;
	private int carNum;
	

	public Car() {
		realNum++;
		carNum = realNum;
	}
	
	public int getCarNum() {
		
		return carNum;
	}
	
	public void setCarNum(int num) {
		this.carNum = num;
	}

	
	
}
