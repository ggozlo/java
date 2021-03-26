package ch05_static;

public class Employee
{
	private static int serialNum = 1000;
	private int employeeID;
	private String demployeeName;
	private String department;
	
	public Employee()
	{
		serialNum++;
		employeeID = serialNum;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getDemployeeName() {
		return demployeeName;
	}

	public void setDemployeeName(String demployeeName) {
		this.demployeeName = demployeeName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public static int getSerialNum() {
		
		return serialNum;
	}
	


	
}
