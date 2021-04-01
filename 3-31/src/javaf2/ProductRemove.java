package javaf2;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductRemove 
{
	static void remove(ArrayList<Product> list, Scanner sc)
	{
		if(list.size() != 0)
		{
			int i=0;
			System.out.println("0\t��ü����");
			for(Product s : list)
			{
				System.out.println(++i +"\t��ǰ�� :"+s.getGoodsname() + " ���� : "+s.getQuantity()+" ���� : "+ s.getPrice()+" ���� :"+DF.df.format(s.getProfit()));
			}
			System.out.print("�����Ϸ��� �л��ǹ�ȣ�� �Է��Ͻÿ� :");
			int select = sc.nextInt();
			if(select > i) System.out.println("���� ��ȣ�Դϴ�!");
			else if(select == 0)
			{
				System.out.print("������ ��ü ���� �ϰڽ��ϱ�?");
				String order = sc.next();
				if (order.equals("Y"))
				{
					list.clear();
				}
				else
				{
					System.out.println("�����߽��ϴ�>");
				}
			}
			else 
			{
				System.out.println("\t��ǰ�� :"+list.get(select-1).goodsname + " ���� : "+list.get(select-1).getQuantity()+
						" ���� : "+ list.get(select-1).getPrice()+" ���� :"+DF.df.format(list.get(select-1).getProfit()));
				System.out.print("������ ���� �Ͻðڽ��ϱ�?(Y/N)");
				String order = sc.next();
				if (order.equals("Y"))
				{
					list.remove(select -1);
				}
				else
				{
					System.out.println("�����߽��ϴ�>");
				}
			}
		}
		else System.out.println("����� �ڷᰡ �����ϴ�!");
	}
}


