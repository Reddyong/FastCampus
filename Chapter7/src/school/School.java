package school;

import java.util.ArrayList;
import java.util.List;

public class School {
	
	private static School instance = new School();
	
	private static String SCHOOL_NAME = "Good School";
	private List<Student> studentList = new ArrayList<>();
	private List<Subject> subjectList = new ArrayList<>();
	
	private School() {}
	
	public static School getInstance() {
		if(instance == null) {
			instance = new School();
		}
		return instance;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	public List<Subject> getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(List<Subject> subjectList) {
		this.subjectList = subjectList;
	}
	
	public void addStudent(Student student) {
		studentList.add(student);
	}
	
	public void addSubject(Subject subject) {
		subjectList.add(subject);
	}
}
