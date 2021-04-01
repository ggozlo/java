package javaf2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ProductCompare 
{
	static void compareProduct(ArrayList<Product> list , Scanner sc)
	{
		if(list.size() <= 0)
		{
			System.out.println("����� �����Ͱ� �����ϴ�!");
		}
		else
		{
			list.stream().sorted(Comparator.comparing(Product :: getProfit).reversed())
			.forEach(s-> System.out.println(s.getGoodsname() + " ���� : "+s.getQuantity()+" ���� : "+ s.getPrice()+" ���� :"+DF.df.format(s.getProfit())));
		}
	}
}
