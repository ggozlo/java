package javaf2;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class ProductOutPut
{

	static void productShowInfo(ArrayList<Product> list)
	{
		if(list.size() <= 0)
		{
			System.out.println("����� �׸��� �����ϴ�!");
		}
		else
		{
			list.stream().forEach(s -> 
			System.out.println(s.getGoodsname() + " ���� : "+s.getQuantity()+" ���� : "+ s.getPrice()+" ���� :"+DF.df.format(s.getProfit())));
		}
	}
}
