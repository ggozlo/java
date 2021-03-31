package ch12_polymorphism;

import java.util.ArrayList;



public class CustomerTest 
{

	public static void main(String[] args)
	{
		ArrayList<Customer> customerList = new ArrayList<>();
		
		Customer customerT = new Customer(10010, "Tomas");
		Customer customerJ = new Customer(10020, "James");
		Customer customerE = new GoldCustomer(10030, "Edward");
		Customer customerP = new GoldCustomer(10040, "Percy");
		Customer customerK = new VIPCustomer(10050, "Kim");
		
		customerList.add(customerT);
		customerList.add(customerJ);
		customerList.add(customerE);
		customerList.add(customerP);
		customerList.add(customerK);
		
		customerList.forEach(s->System.out.println(s.toString()));
		
		int price = 10000;
		for(Customer customer : customerList)
		{
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName()+" 님 지불 "+ cost);
			System.out.println("보너스 포인트는 "+customer.bonusPoint);
		}
	}

}
