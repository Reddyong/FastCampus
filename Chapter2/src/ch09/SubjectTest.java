package ch09;

public class SubjectTest {

	public static void main(String[] args) {

		Student student = new Student(20180636, "reddyong");
		student.setKoreaSubject("국어", 100);
		student.setMathSubject("수학", 100);
		
		student.showScoreInfo();
	}

}
