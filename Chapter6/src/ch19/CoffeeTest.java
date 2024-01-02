package ch19;

public class CoffeeTest {

	public static void main(String[] args) {

		Coffee etiopiaCoffee = new EtiopiaAmericano();
		etiopiaCoffee.brewing();
		
		System.out.println();
		Coffee etiopiaLatteCoffee = new Latte(etiopiaCoffee);
		etiopiaLatteCoffee.brewing();
		
		System.out.println();
		Coffee mochaCoffee = new Mocha(new Latte(new EtiopiaAmericano()));
		mochaCoffee.brewing();
		
	}

}
