package test3;

public class Hyundai 
{
	int car;
	
	synchronized void product()
	{
		if(car > 3)
		{
			try
			{
				System.out.println("생산중단");
				wait();
				
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
		
		car++;
		notifyAll();
		System.out.println("생산, 재고:"+car);
		
	}
	
	synchronized void sale()
	{
		
		if(car < 1)
		{
			try
			{
				System.out.println("생산재개");
				wait();
				
			} 
			catch (InterruptedException e) 
			{
				
				e.printStackTrace();
			}
		}

		
		car--;
		notifyAll();
		System.out.println("판매, 재고:"+car);
	}

	
}
