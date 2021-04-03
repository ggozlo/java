package ch18_interface2;

public class CompleteClalc extends Calculator
{

	@Override
	public int times(int a, int b) 
	{
		return a * b;
	}

	@Override
	public int divide(int a, int b) 
	{
		if(b == 0) return ERROR;
		return a / b;
	}
	
	public void showInfo() 
	{
		System.out.println("모두 구현했습니다");
	}

//	@Override
//	public void description() 
//	{
//		System.out.println("CompleteCalc overriding");
//	}
//	
	
}
