package ch24;

import java.util.ArrayList;

public class Student {

	private int studentId;
	private String studentName;
	ArrayList<Subject> subjectList;
	
	public Student(int id, String name) {
		this.studentId = id;
		this.studentName = name;
		
		subjectList = new ArrayList<>();
	}
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		
		subject.setName(name);
		subject.setScore(score);
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		int total = 0;
		
		for(Subject subject : subjectList) {
			
			System.out.println("학생 " + studentName + "의 " + subject.getName()
			+ "과목 성적은 " + subject.getScore() + "입니다.");
			
			total += subject.getScore();
		}
		
		System.out.println("학생 " + studentName + "의 총점은 " + total + "입니다.");
	}
}
