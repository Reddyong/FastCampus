package ch08;

public class Order {

	public Long orderNum;
	public String phoneNum;
	public String address;
	public Long orderDate;
	public Long orderTime;
	public Long price;
	public Long  menuNum;
	
	public Order(Long oNum, String pNum, String add, Long date, Long time, Long pri, Long mNum) {
		this.orderNum = oNum;
		this.phoneNum = pNum;
		this.address = add;
		this.orderDate = date;
		this.orderTime = time;
		this.price = pri;
		this.menuNum = mNum;
	}
	
	public void showInformation() {
		System.out.println("주문 접수 번호 : " + orderNum);
		System.out.println("주문 핸드폰 번호 : " + phoneNum);
		System.out.println("주문 집 주소 : " + address);
		System.out.println("주문 날짜 : " + orderDate);
		System.out.println("주문 시간 : " + orderTime);
		System.out.println("주문 가격 : " + price);
		System.out.println("메뉴 번호 : " + menuNum);
		
	}
}
