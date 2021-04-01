package javafinal;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Retouch
{
	static void retouch(ArrayList<Score> list, Scanner sc)
	{

		if(list.size() != 0)
		{
			int i=-1;
			DecimalFormat df = new DecimalFormat("#0.#");
			for(Score s : list)
			{
				
				System.out.println(++i +"\t�̸� : "+s.name+" ����� :"+s.kor+
						" ����� :"+s.eng+" ���м��� :"+s.mat+" ���� :"+s.tot+" ��� :"+df.format(s.avg)+" ���� :"+s.hak);
				
			}
			System.out.print("�����Ϸ��� �л��ǹ�ȣ�� �Է��Ͻÿ� :");
			int select = sc.nextInt();
			if(select > i) System.out.println("���� ��ȣ�Դϴ�!");
			else 
			{
//				System.out.print("���ο� �̸��� �Է��Ͻÿ� :");
//				list.get(select).setName(sc.next());
				
				System.out.print("���ο� ���������� �Է��Ͻÿ� :");	
				list.get(select).setKor(sc.nextInt());
		
				System.out.print("���ο� ���������� �Է��Ͻÿ� :");
				list.get(select).setEng(sc.nextInt());
		
				System.out.print("���ο� ���������� �Է��Ͻÿ� :");
				list.get(select).setMat(sc.nextInt());

				ScoreProcess.scoreprocess(list.get(select));
			}
		}
		else System.out.println("����� �ڷᰡ �����ϴ�!");
	}
}
