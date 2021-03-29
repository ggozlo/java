package test;
// 필드명 : 부서명 (인사과, 자재과, 총무과)
// 근무개월 (단위 M) 
// 월 급여


public class Department
{
	enum departments {PERSONNEL , MATERIALS, AFFAIRS}

	static String PERSONNEL = "인사과";
	static String MATERIALS = "자재과";
	static String AFFAIRS = "총무과";

	
	departments department;
	int workingMonth;
	int salary;
	
	public Department(departments department, int workingMonth, int salary)
	{
		super();
		this.department = department;
		this.workingMonth = workingMonth;
		this.salary = salary;
	}

	public departments getDepartment() {
		return department;
	}

	public void setDepartment(departments department) {
		this.department = department;
	}

	public int getWorkingMonth() {
		return workingMonth;
	}

	public void setWorkingMonth(int workingMonth) {
		this.workingMonth = workingMonth;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	
}
