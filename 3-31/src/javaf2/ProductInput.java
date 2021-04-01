package javaf2;


import java.util.ArrayList;
import java.util.Scanner;

public class ProductInput
{
	static void input(ArrayList<Product> list, Scanner sc)
	{
		DataImport di = DataImport.getInstance();
		String name= di.InputString(sc, "상품명");
		int quantity = di.InputInt(sc, "수량");
		int price = di.InputInt(sc, "가격");
		int profit = quantity * price;
		list.add(new Product(name, quantity, price, profit));
	}
}
