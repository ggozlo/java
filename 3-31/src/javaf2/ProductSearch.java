package javaf2;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductSearch
{
	static void searchProduct(ArrayList<Product> list,Scanner sc)
	{

		if(list.size()<=0)
		{
			System.out.println("����� �����Ͱ� �����ϴ�!");
		}
		else
		{
			System.out.print("ã�� ��ǰ�� �Է��Ͻÿ� :");
			String name = sc.next();
			
			int cnt = (int)list.stream().filter(s -> s.getGoodsname().contains(name)).count();
			if(cnt ==0)
			{
				System.out.println("ã�� ������ �����ϴ�");
			}
			else
			{
			list.stream().filter(s -> s.getGoodsname().contains(name))
			.forEach(s -> System.out.println(s.getGoodsname() + " ���� : "+s.getQuantity()+" ���� : "+ s.getPrice()+" ���� :"+DF.df.format( s.getProfit())));
			}
		}
	}
}
