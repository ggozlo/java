package javaf2;

import java.util.ArrayList;

public class ProductOutPut
{
	static void productShowInfo(ArrayList<Product> list)
	{
		list.stream().forEach(s -> 
		System.out.println(s.getGoodsname() + " ���� : "+s.getQuantity()+" ���� : "+ s.getPrice()+" ���� :"+s.getProfit()));
	}
}
