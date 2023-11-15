package ch03;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customerLee = new Customer(1001, "Lee");

		customerLee.bonusPoint = 1000;
		
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer(1002, "Kim");
		customerKim.bonusPoint = 10000;
		
		System.out.println(customerKim.showCustomerInfo());
		
		Customer vc = new VIPCustomer(12345, "noname");
		
		

	}

}
