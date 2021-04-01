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
				
				System.out.println(++i +"\t이름 : "+s.name+" 국어성적 :"+s.kor+
						" 영어성적 :"+s.eng+" 수학성적 :"+s.mat+" 총점 :"+s.tot+" 평균 :"+df.format(s.avg)+" 학점 :"+s.hak);
				
			}
			System.out.print("수정하려는 학생의번호를 입력하시오 :");
			int select = sc.nextInt();
			if(select > i) System.out.println("없는 번호입니다!");
			else 
			{
//				System.out.print("새로운 이름을 입력하시오 :");
//				list.get(select).setName(sc.next());
				
				System.out.print("새로운 국어점수을 입력하시오 :");	
				list.get(select).setKor(sc.nextInt());
		
				System.out.print("새로운 영어점수을 입력하시오 :");
				list.get(select).setEng(sc.nextInt());
		
				System.out.print("새로운 수학점수을 입력하시오 :");
				list.get(select).setMat(sc.nextInt());

				ScoreProcess.scoreprocess(list.get(select));
			}
		}
		else System.out.println("저장된 자료가 없습니다!");
	}
}
