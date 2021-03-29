package test;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;
import java.util.Scanner;

import test.Department.departments;

public class Test 
{

	public static void main(String[] args) 
	{
		List<Department> list = Arrays.asList(
				new Department(departments.PERSONNEL, 15, 2555555),
				new Department(departments.AFFAIRS, 26, 4894555),
				new Department(departments.PERSONNEL, 4, 2355555),
				new Department(departments.MATERIALS, 17, 2556789),
				new Department(departments.MATERIALS, 12, 1055000),
				new Department(departments.PERSONNEL, 15, 3555555),
				new Department(departments.AFFAIRS, 8, 2000000),
				new Department(departments.AFFAIRS, 10, 3000000),
				new Department(departments.MATERIALS, 19, 4456789)
				);
		
		DecimalFormat df = new DecimalFormat("#,##0");
		list.stream().sorted(Comparator.comparing(Department :: getDepartment)).forEach(d -> 
		{
			String st = null;
			if(d.getDepartment() == departments.PERSONNEL)
			{
				st = "인사과";
			}
			else if(d.getDepartment() == departments.MATERIALS)
			{
				st = "자재과";
			}
			else if(d.getDepartment() == departments.AFFAIRS)
			{
				st = "총무과";
			}
			System.out.println(st+"\t"+d.getWorkingMonth()+"\t"+df.format(d.getSalary())+"원");
		});
	
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 부서명:");
		String name = sc.next();
		String select = null;

		if(name.equals("인사과"))
		{
			select = "PERSONNEL";
		}
		else if(name.equals("자재과"))
		{
			select ="MATERIALS";
		}
		else if(name.equals("총무과"))
		{
			select = "AFFAIRS";
		}
		final String value = select;
		
		int count = (int) list.stream().filter(f -> f.getDepartment() == departments.valueOf(value) ).count();
		double avgMonth = list.stream().filter(f -> f.getDepartment() == departments.valueOf(value) ).mapToInt(Department::getWorkingMonth).average().getAsDouble();
		double averageSalary = list.stream().filter(f -> f.getDepartment() == departments.valueOf(value) ).mapToInt(Department::getSalary).average().getAsDouble();
		int maxPay = list.stream().filter(f -> f.getDepartment() == departments.valueOf(value) ).mapToInt(Department::getSalary).max().getAsInt();
		System.out.println(count + "명 평균 근무:" + (int)avgMonth/12 + "년 " + (int)avgMonth%12+"개월 평균급여:"+df.format(averageSalary)+"원 최고급여:"+df.format(maxPay));
		
		}
	}


