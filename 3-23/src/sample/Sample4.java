package sample;

class Bank 
{
	
	String name;
	
	
	public Bank(String name) 
	{
		super();
		this.name = name;
	}


	private static Bank b = new Bank("한국은행");


	public String getName() 
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public static Bank getB() 
	{
		return b;
	}
	public static void setB(Bank b)
	{
		Bank.b = b;
	}
	
	
}
public class Sample4 
{

	public static void main(String[] args)
	{
		Bank b = Bank.getB();
		System.out.println(b.getName());
		
	}

}
