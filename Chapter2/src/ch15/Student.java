package ch15;

public class Student {
	
	private String name;
	private int money;
	
	public Student(String studentName, int money) {
		this.name = studentName;
		this.money = money;
	}
	
	public void takeTaxi(Taxi taxi, int taxiPrice) {
		taxi.take(taxiPrice);
		this.money -= taxiPrice;
	}
	
	public void showInfo() {
		System.out.println(name + "님의 남은 돈은 " + money + "원 입니다.");
	}

}
