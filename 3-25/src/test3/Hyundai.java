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
				System.out.println("�����ߴ�");
				wait();
				
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
		
		car++;
		notifyAll();
		System.out.println("����, ���:"+car);
		
	}
	
	synchronized void sale()
	{
		
		if(car < 1)
		{
			try
			{
				System.out.println("�����簳");
				wait();
				
			} 
			catch (InterruptedException e) 
			{
				
				e.printStackTrace();
			}
		}

		
		car--;
		notifyAll();
		System.out.println("�Ǹ�, ���:"+car);
	}

	
}
