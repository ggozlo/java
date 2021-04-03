package ch18_interface2;

public interface Calc
{
	double PI = 3.14;
	int ERROR = -9999999;
	
	int add(int a, int b);
	int substract(int a, int b);
	int times(int a, int b);
	int divide(int a, int b);
	
	default void description()
	{
		System.out.println("정수의 사칙연산을 제공합니다.");
		myMethod();
	}
	
	static int total(int [] arr)
	{
		int total = 0;
		for(int num:arr)
		{
			total += num;
		}
		mystaticMethod();
		return total;
	}
	
	private void myMethod()
	{
		System.out.println("myMethod");
	}
	
	private static void mystaticMethod()
	{
		System.out.println("myStaticMethod");
	}
}
