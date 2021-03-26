package test1;

public class Test
{

	public static void main(String[] args)
	{
		
		Sample ss = new Sample();
		
		ss.setPriority(Thread.MAX_PRIORITY);
		ss.start();
		
		

	}

}
