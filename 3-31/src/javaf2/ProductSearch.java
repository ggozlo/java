package javaf2;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductSearch
{
	static void searchProduct(ArrayList<Product> list,Scanner sc)
	{
		System.out.println("ã�� ��ǰ�� �Է��Ͻÿ� :");
		String name = sc.next();
		list.stream().filter(s -> s.getGoodsname().contains(name))
		.forEach(s -> System.out.println(s.getGoodsname() + " ���� : "+s.getQuantity()+" ���� : "+ s.getPrice()+" ���� :"+s.getProfit()));
	}
}
