package ch08;

public class GenericPrinterTest {

	public static void main(String[] args) {

		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
		powderPrinter.setMaterial(new Powder());
		System.out.println(powderPrinter);
		
		Powder powder = powderPrinter.getMaterial();
		powderPrinter.toString();

		
	}

}
