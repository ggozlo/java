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
			System.out.println("0\t전체삭제");
			for(Score s : list)
			{
				
				System.out.println(++i +"\t이름 : "+s.name+" 국어성적 :"+s.kor+
						" 영어성적 :"+s.eng+" 수학성적 :"+s.mat+" 총점 :"+s.tot+" 평균 :"+df.format(s.avg)+" 학점 :"+s.hak);
				
			}
			System.out.print("삭제하려는 학생의번호를 입력하시오 :");
			int select = sc.nextInt();
			if(select > i) System.out.println("없는 번호입니다!");
			else if(select == 0)
			{
				System.out.print("정말로 전체 삭제 하겠습니까?");
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
				System.out.println("\t이름 : "+list.get(select).name+" 국어성적 :"+list.get(select).kor+
						" 영어성적 :"+list.get(select).eng+" 수학성적 :"+list.get(select).mat+" 총점 :"+list.get(select).tot+" 평균 :"+df.format(list.get(select).avg)+" 학점 :"+list.get(select).hak);
				System.out.print("정말로 삭제 하시겠습니까?(Y/N)");
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
		else System.out.println("저장된 자료가 없습니다!");
	}
}
