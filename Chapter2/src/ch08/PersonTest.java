package ch08;

public class PersonTest {

	public static void main(String[] args) {

		Person person = new Person();
		
		person.setHeight(180);
		person.setWeight(78);
		person.setSex("남성");
		person.setName("Tomas");
		person.setAge(37);
		
		person.showInfo();
		
	}

}
