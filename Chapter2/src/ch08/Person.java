package ch08;

public class Person {

	public int personHeight;
	public int personWeight;
	public String personSex;
	public String personName;
	public int personAge;
	
	public int getHeight() {
		return personHeight;
	}
	public void setHeight(int height) {
		personHeight = height;
	}
	
	public int getWeight() {
		return personWeight;
	}
	public void setWeight(int weight) {
		personWeight = weight;
	}
	
	public String getSex() {
		return personSex;
	}
	public void setSex(String sex) {
		personSex = sex;
	}
	
	public String getName() {
		return personName;
	}
	public void setName(String name) {
		personName = name;
	}
	
	public int getAge() {
		return personAge;
	}
	public void setAge(int age) {
		personAge = age;
	}
	
	public void showInfo() {
		System.out.println("키가 " + personHeight + " 이고 몸무게가 " + personWeight
				+ " 킬로인 " + personSex + "이 있습니다. 이름은 " + personName + " 이고 나이는 "
				+ personAge + "세입니다.");
	}
	
}
