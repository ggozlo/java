package test3;

public class Test
{

	public static void main(String[] args) 
	{
		Hyundai hd = new Hyundai();
		Product pd = new Product(hd);
		Sale sl = new Sale(hd);
		
		pd.start();
		sl.start();

	}

}
