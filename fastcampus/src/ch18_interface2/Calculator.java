package ch18_interface2;

public abstract class Calculator implements Calc
{

	@Override
	public int add(int a, int b)
	{
		return a + b;
	}

	@Override
	public int substract(int a, int b) 
	{
		return a - b;
	}

}
