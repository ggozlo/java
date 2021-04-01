package javaf2;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductReform 
{
	static void reformProduct(ArrayList<Product> list, Scanner sc)
	{
		if(list.size() <= 0)
		{
			System.out.println("자료가 없습니다!");
		}
		else
		{
			DataImport di = DataImport.getInstance();
			int i=-1;
			for(Product s : list)
			{
				System.out.println(++i+"\t상품명 :"+s.getGoodsname() + " 수량 : "+s.getQuantity()+" 가격 : "+ s.getPrice()+" 이익 :"+DF.df.format(s.getProfit()));
	
			}
			System.out.print("수정할려는 상품번호를 입력하시오 :");
			int select = sc.nextInt();
			list.get(select).setQuantity(di.InputInt(sc, "새로운 수량"));
			list.get(select).setPrice(di.InputInt(sc, "새로운 가격"));
			list.get(select).setProfit(list.get(select).getPrice() * list.get(select).getQuantity());
		}
	}
}
