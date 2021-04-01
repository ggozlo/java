package javaf2;


import java.util.ArrayList;
import java.util.Scanner;

public class ProductInput
{
	static void input(ArrayList<Product> list, Scanner sc)
	{
		DataImport di = DataImport.getInstance();
		String name= di.InputString(sc, "��ǰ��");
		int quantity = di.InputInt(sc, "����");
		int price = di.InputInt(sc, "����");
		int profit = quantity * price;
		list.add(new Product(name, quantity, price, profit));
	}
}
