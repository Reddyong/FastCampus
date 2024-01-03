package ch23;

import java.util.ArrayList;
import java.util.List;

class FastLibrary {
	public List<String> shelf = new ArrayList<>();
	
	public FastLibrary(){
		shelf.add("태백산맥1");
		shelf.add("태백산맥2");
		shelf.add("태백산맥3");
	}
	
	public synchronized String lendBook() throws InterruptedException {
		
		Thread t = Thread.currentThread();
		
		while(shelf.size() == 0) {
			System.out.println(t.getName() + " waiting start ");
			wait();
			System.out.println(t.getName() + " waiting end ");
		}
		
		if(shelf.size() != 0) {

			String book = shelf.remove(0);
			System.out.println(t.getName() + " : " + book + " lend ");
			return book;
		}
		
		
		return null;
	}
	
	public synchronized void returnBook(String book) {
		
		Thread t = Thread.currentThread();
		
		shelf.add(book);
		notifyAll();
		System.out.println(t.getName() + " : " + book + " return ");
	}
}

class Student extends Thread{
	
	public Student(String name) {
		super(name);
	}
	
	public void run() {
		
		
		try {
			String title = LibraryMain.library.lendBook();
			
			if(title == null) {
				System.out.println(getName() + " : 빌리지 못했음");
				return;
			}
		
			sleep(5000);
		
			LibraryMain.library.returnBook(title);
		}catch (InterruptedException e) {
			System.out.println(e);
		}
	}
	
	
}

public class LibraryMain {

	public static FastLibrary library = new FastLibrary();
	
	public static void main(String[] args) {

		Student st1 = new Student("std1");
		Student st2 = new Student("std2");
		Student st3 = new Student("std3");
		Student st4 = new Student("std4");
		Student st5 = new Student("std5");
		Student st6 = new Student("std6");
		
		st1.start();
		st2.start();
		st3.start();
		st4.start();
		st5.start();
		st6.start();
	}

}
