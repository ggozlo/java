package test;
// �ʵ�� : �μ��� (�λ��, �����, �ѹ���)
// �ٹ����� (���� M) 
// �� �޿�


public class Department
{
	enum departments {PERSONNEL , MATERIALS, AFFAIRS}

	static String PERSONNEL = "�λ��";
	static String MATERIALS = "�����";
	static String AFFAIRS = "�ѹ���";

	
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
