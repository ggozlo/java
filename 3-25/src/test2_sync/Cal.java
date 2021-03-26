package test2_sync;

public class Cal extends Thread
{
	int dan;

	public Cal(int dan) 
	{
		super();
		this.dan = dan;
	}

	
	@Override
	public void run() 
	{
		for(int i=1;i<=9;i++)
		{
			if(dan==4)
			{
				try {
					join(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			System.out.println(dan+"*"+i+"="+(dan*i));
		}
		
	} 
	
	
}
