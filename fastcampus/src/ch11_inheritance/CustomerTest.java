package ch11_inheritance;

public class CustomerTest 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Customer ctLee = new Customer(1001,"Kim");

		ctLee.bonusPoint = 1000;
		System.out.println(ctLee.toString());
		
		VIPCustomer ctKim = new VIPCustomer(1002,"Lee");

		ctKim.bonusPoint = 10000;		
		System.out.println(ctKim.toString());
	}

}
