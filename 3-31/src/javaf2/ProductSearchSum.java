package javaf2;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductSearchSum 
{
	public static void searchsum(ArrayList<Product> list, Scanner sc)
	{
		System.out.print("상품명을 입력 :");
		String sname = sc.next();
		int sum=  list.stream().filter(s-> s.getGoodsname().equals(sname)).mapToInt(Product::getProfit).sum();
		System.out.println(sum);
	}
}
