package test3;

public class Sale extends Thread
{
	Hyundai car;
	
	public Sale(Hyundai car)
	{
		super();
		this.car = car;
	}
	
	public void run()
	{
		for(int i = 0 ; i<=5;i++)
		{
			car.sale();
		}
	}

}