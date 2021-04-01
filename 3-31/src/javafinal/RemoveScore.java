package javafinal;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class RemoveScore 
{
	static void remove(ArrayList<Score> list, Scanner sc)
	{

		if(list.size() != 0)
		{
			int i=0;
			DecimalFormat df = new DecimalFormat("#0.#");
			System.out.println("0\t��ü����");
			for(Score s : list)
			{
				
				System.out.println(++i +"\t�̸� : "+s.name+" ����� :"+s.kor+
						" ����� :"+s.eng+" ���м��� :"+s.mat+" ���� :"+s.tot+" ��� :"+df.format(s.avg)+" ���� :"+s.hak);
				
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
					
				}
			}
			else 
			{
				System.out.println("\t�̸� : "+list.get(select).name+" ����� :"+list.get(select).kor+
						" ����� :"+list.get(select).eng+" ���м��� :"+list.get(select).mat+" ���� :"+list.get(select).tot+" ��� :"+df.format(list.get(select).avg)+" ���� :"+list.get(select).hak);
				System.out.print("������ ���� �Ͻðڽ��ϱ�?(Y/N)");
				String order = sc.next();
				if (order.equals("Y"))
				{
					list.remove(select-1);
				}
				else
				{
					
				}
			}
		}
		else System.out.println("����� �ڷᰡ �����ϴ�!");
	}
}
