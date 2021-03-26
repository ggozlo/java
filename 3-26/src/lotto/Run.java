package lotto;



public class Run
{
	public static void main(String[] args)
	{
		
	
		Creater cr = new Creater(10000);

		for(Lotto c : cr.getAl() )
		{
			c.ptr();
		}
		
		
	}	
		
		

}
