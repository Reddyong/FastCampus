package ch16;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee employee = new Employee();
		employee.setEmloyeeName("reddyong");
		
		System.out.println(Employee.getSerialNum());
		
		Employee employee2 = new Employee();
		employee2.setEmloyeeName("seoyeon");
		
		System.out.println(employee.getEmloyeeName() + "님의 사번은 " + employee.getEmployeeId() + "입니다.");
		System.out.println(employee2.getEmloyeeName() + "님의 사번은 " + employee2.getEmployeeId() + "입니다.");
	}

}
