package ch06_singletone;

import java.util.Calendar;

public class Test {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Company cp = Company.getInstance();
		Company cp2 = Company.getInstance();
		
		System.out.println(cp);
		System.out.println(cp2);
		
		Calendar calendar = Calendar.getInstance();
	}

}
