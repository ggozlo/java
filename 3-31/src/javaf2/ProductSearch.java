package javaf2;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductSearch
{
	static void searchProduct(ArrayList<Product> list,Scanner sc)
	{
		System.out.println("찾는 상품을 입력하시오 :");
		String name = sc.next();
		list.stream().filter(s -> s.getGoodsname().contains(name))
		.forEach(s -> System.out.println(s.getGoodsname() + " 수량 : "+s.getQuantity()+" 가격 : "+ s.getPrice()+" 이익 :"+s.getProfit()));
	}
}
