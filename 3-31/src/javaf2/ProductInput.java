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
		System.out.print("��ǰ���� �Է��Ͻÿ� :");
		name = sc.next();
		System.out.print("������ �Է��Ͻÿ� :");
		quantity = sc.nextInt();
		System.out.print("������ �Է��Ͻÿ� :");
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
