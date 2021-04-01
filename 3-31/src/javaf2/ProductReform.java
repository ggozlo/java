package javaf2;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductReform 
{
	static void reformProduct(ArrayList<Product> list, Scanner sc)
	{
		if(list.size() <= 0)
		{
			System.out.println("�ڷᰡ �����ϴ�!");
		}
		else
		{
			DataImport di = DataImport.getInstance();
			int i=-1;
			for(Product s : list)
			{
				System.out.println(++i+"\t��ǰ�� :"+s.getGoodsname() + " ���� : "+s.getQuantity()+" ���� : "+ s.getPrice()+" ���� :"+DF.df.format(s.getProfit()));
	
			}
			System.out.print("�����ҷ��� ��ǰ��ȣ�� �Է��Ͻÿ� :");
			int select = sc.nextInt();
			list.get(select).setQuantity(di.InputInt(sc, "���ο� ����"));
			list.get(select).setPrice(di.InputInt(sc, "���ο� ����"));
			list.get(select).setProfit(list.get(select).getPrice() * list.get(select).getQuantity());
		}
	}
}
