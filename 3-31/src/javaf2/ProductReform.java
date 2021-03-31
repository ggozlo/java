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
		System.out.print("수정할려는 상품번호를 입력하시오 :");
		int select = sc.nextInt();
		System.out.print("새로운 이름을 입력하시오 :");
		String newName = sc.next();
		list.get(select).setGoodsname(newName);
		System.out.print("새로운 수량을 입력하시오 :");
		int newQuantity = sc.nextInt();
		list.get(select).setQuantity(newQuantity);
		System.out.print("새로운 가격을 입력하시오 :");
		int newPrice = sc.nextInt();
		list.get(select).setPrice(newPrice);

		list.get(select).setProfit(list.get(select).getPrice() * list.get(select).getQuantity());
		
	}
}
