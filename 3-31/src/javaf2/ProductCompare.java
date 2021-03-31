package javaf2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ProductCompare 
{
	static void compareProduct(ArrayList<Product> list , Scanner sc)
	{
		list.stream().sorted(Comparator.comparing(Product :: getGoodsname))
		.forEach(s-> System.out.println(s.getGoodsname() + " 수량 : "+s.getQuantity()+" 가격 : "+ s.getPrice()+" 이익 :"+s.getProfit()));
	
	}
	
	
	
}
