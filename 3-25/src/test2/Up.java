package test2;

public class Up extends Thread
{
	Share data;

	public Up(Share data) 
	{
		super();
		this.data = data;
	}
	
	public void run()
	{
		for(int i = 1;i<=5;i++)
		{
			data.up();
		}
	}
}
