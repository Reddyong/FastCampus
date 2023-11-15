package ch08;

public class OrderTest {

	public static void main(String[] args) {

		Order order = new Order(202011020003L, "01049173156", "서울시 관악구 삼성동", 20201102L
				, 130258L, 35000L, 0003L);
		
		order.showInformation();
	}

}
