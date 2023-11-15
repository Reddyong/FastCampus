package ch16;

public class Employee {

	private static int serialNum = 1000;
	
	private int employeeId;
	private String emloyeeName;
	private String department;
	
	
	public Employee() {
		
		serialNum++;
		employeeId = serialNum;
	}
	
	
	public static int getSerialNum() {
		return serialNum;
	}

	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmloyeeName() {
		return emloyeeName;
	}
	public void setEmloyeeName(String emloyeeName) {
		this.emloyeeName = emloyeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
}
