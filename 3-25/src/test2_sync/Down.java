package test2_sync;

public class Down extends Thread
{
	Share data;

	public  Down(Share data) 
	{
		super();
		this.data = data;
	}
	
	public void run()
	{
		for(int i = 1;i<=5;i++)
		{
			data.down();
		}
	}
}