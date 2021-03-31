package javaf2;

import java.util.ArrayList;

public class ProductOutPut
{
	static void productShowInfo(ArrayList<Product> list)
	{
		list.stream().forEach(s -> 
		System.out.println(s.getGoodsname() + " 수량 : "+s.getQuantity()+" 가격 : "+ s.getPrice()+" 이익 :"+s.getProfit()));
	}
}
