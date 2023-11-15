package ch21;

public class ObjectCopy {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
				
		library[0] = new Book("JPA", "RED");
		library[1] = new Book("ORM", "BIG");
		library[2] = new Book("SPRING", "DRAGON");
		library[3] = new Book("DATA", "SEO");
		library[4] = new Book("HTML", "YEON");

		System.arraycopy(library, 0, copyLibrary, 0, 5);
		
		System.out.println("==library==");
		for (Book book : library) {
			System.out.println(book);
			book.showInfo();
		}
		
		System.out.println("==copy library==");
		for (Book book : copyLibrary) {
			System.out.println(book);
			book.showInfo();
		}
		
		library[0].setAuthor("박완서");
		library[0].setTitle("나목");
		
		System.out.println("==library==");
		for (Book book : library) {
			System.out.println(book);
			book.showInfo();
		}
		
		System.out.println("==copy library==");
		for (Book book : copyLibrary) {
			System.out.println(book);
			book.showInfo();
		}
	}

}
