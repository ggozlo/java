package javafinal;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class ScoreOutput 
{

	public void showInfo(ArrayList<Score> alist)
	{
		DecimalFormat df = new DecimalFormat("#0.#");
	
		for(Score s : alist)
		{
			System.out.println("이름 : "+s.name+" 국어성적 :"+s.kor+
					" 영어성적 :"+s.eng+" 수학성적 :"+s.mat+" 총점 :"+s.tot+" 평균 :"+df.format(s.avg)+" 학점 :"+s.hak);
		}
	
	}
}
