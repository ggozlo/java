package javaf2;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductInput
{
	static void input(ArrayList<Product> list, Scanner sc)
	{
		String name=null;
		int quantity=0,price=0,profit = 0;
		try 
		{
		System.out.print("상품명을 입력하시오 :");
		name = sc.next();
		System.out.print("수량을 입력하시오 :");
		quantity = sc.nextInt();
		System.out.print("가격을 입력하시오 :");
		price = sc.nextInt();
		profit = quantity * price;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			sc.nextLine();
		}
		
		
		list.add(new Product(name, quantity, price, profit));
	}
}
