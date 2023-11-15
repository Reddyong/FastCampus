package ch21;

public class BookTest {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		
//		for(int i = 0;i<library.length;i++) {
//			System.out.println(library[i]);
//		}
		
		library[0] = new Book("JPA", "RED");
		library[1] = new Book("ORM", "BIG");
		library[2] = new Book("SPRING", "DRAGON");
		library[3] = new Book("DATA", "SEO");
		library[4] = new Book("HTML", "YEON");
		
		for (Book book : library) {
			System.out.println(book);
			book.showInfo();
		}
	}

}
