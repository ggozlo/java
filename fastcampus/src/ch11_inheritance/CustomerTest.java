package ch11_inheritance;

public class CustomerTest 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Customer ctLee = new Customer(1001,"Lee");

		ctLee.bonusPoint = 1000;
		int price = ctLee.calcPrice(1000);
		System.out.println(ctLee.toString()+""+price);
		
		VIPCustomer ctKim = new VIPCustomer(1002,"Kim");

		ctKim.bonusPoint = 10000;
		price = ctKim.calcPrice(1000);
		System.out.println(ctKim.toString()+" "+price);
	}

}
