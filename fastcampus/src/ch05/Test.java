package ch05;

public class Test
{

	public static void main(String[] args) 
	{
		Employee employeeLee = new Employee();
		employeeLee.setDemployeeName("이순신");
		
		System.out.println(employeeLee.getSerialNum());
		
		Employee employeeKim = new Employee();
		employeeKim.setDemployeeName("김유신");
		
		System.out.println(employeeLee.getDemployeeName() +  employeeLee.getEmployeeID());
		System.out.println(employeeKim.getEmployeeID());
		
	}

}
