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
			System.out.println("저장된 데이터가 없습니다!");
		}
		else
		{
			list.stream().sorted(Comparator.comparing(Product :: getProfit).reversed())
			.forEach(s-> System.out.println(s.getGoodsname() + " 수량 : "+s.getQuantity()+" 가격 : "+ s.getPrice()+" 이익 :"+DF.df.format(s.getProfit())));
		}
	}
}
