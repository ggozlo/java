package lambda;

//public class Korea implements Runnable
//{
//	@Override
//	public void run() 
//	{
//		for(int i=0;i<=10;i++)
//		{
//			System.out.println(i);
//		}
//		
//	}
//}

public class Korea extends Thread
{
	@Override
	public void run() 
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
		}

	}
}