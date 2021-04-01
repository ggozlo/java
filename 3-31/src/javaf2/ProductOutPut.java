package javaf2;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class ProductOutPut
{

	static void productShowInfo(ArrayList<Product> list)
	{
		if(list.size() <= 0)
		{
			System.out.println("저장된 항목이 없습니다!");
		}
		else
		{
			list.stream().forEach(s -> 
			System.out.println(s.getGoodsname() + " 수량 : "+s.getQuantity()+" 가격 : "+ s.getPrice()+" 이익 :"+DF.df.format(s.getProfit())));
		}
	}
}
