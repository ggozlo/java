package javaf2;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductReform 
{
	static void reformProduct(ArrayList<Product> list, Scanner sc)
	{
		int i=0;
		for(Product s : list)
		{
			System.out.println(i+"\t"+s.getGoodsname());
			i++;
		}
		System.out.print("�����ҷ��� ��ǰ��ȣ�� �Է��Ͻÿ� :");
		int select = sc.nextInt();
		System.out.print("���ο� �̸��� �Է��Ͻÿ� :");
		String newName = sc.next();
		list.get(select).setGoodsname(newName);
		System.out.print("���ο� ������ �Է��Ͻÿ� :");
		int newQuantity = sc.nextInt();
		list.get(select).setQuantity(newQuantity);
		System.out.print("���ο� ������ �Է��Ͻÿ� :");
		int newPrice = sc.nextInt();
		list.get(select).setPrice(newPrice);

		list.get(select).setProfit(list.get(select).getPrice() * list.get(select).getQuantity());
		
	}
}
