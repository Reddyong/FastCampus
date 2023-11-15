package ch07;

public class ThreeDPrinterTest {

	public static void main(String[] args) {

		Powder powder = new Powder();
		ThreeDPrinter3 printer3 = new ThreeDPrinter3();
		
		printer3.setMaterial(powder);
		
		Powder powder2 = (Powder) printer3.getMaterial();
	}

}
