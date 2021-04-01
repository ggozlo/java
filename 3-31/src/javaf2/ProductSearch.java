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
			System.out.println("저장된 데이터가 없습니다!");
		}
		else
		{
			System.out.print("찾는 상품을 입력하시오 :");
			String name = sc.next();
			
			int cnt = (int)list.stream().filter(s -> s.getGoodsname().contains(name)).count();
			if(cnt ==0)
			{
				System.out.println("찾는 물건이 없습니다");
			}
			else
			{
			list.stream().filter(s -> s.getGoodsname().contains(name))
			.forEach(s -> System.out.println(s.getGoodsname() + " 수량 : "+s.getQuantity()+" 가격 : "+ s.getPrice()+" 이익 :"+DF.df.format( s.getProfit())));
			}
		}
	}
}
