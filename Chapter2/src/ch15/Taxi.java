package ch15;

public class Taxi {

	private String taxiName;
	private int income;
	
	public Taxi(String name) {
		this.taxiName = name;
	}
	
	public void take(int price) {
		this.income += price;
	}
	
	public void showTaxiInfo() {
		System.out.println(taxiName + " 수입은 " + income + "원 입니다.");
	}
}
