package test3;

public class Product extends Thread
{
	Hyundai car;
	
	public Product(Hyundai car)
	{
		super();
		this.car = car;
	}
	
	public void run()
	{
		for(int i = 0 ; i<=5;i++)
		{
			car.product();
		}
	}

}
