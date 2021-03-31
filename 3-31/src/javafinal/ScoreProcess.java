package javafinal;

import java.util.ArrayList;

public class ScoreProcess
{
	public static void scoreprocess(Score s)
	{
//		for(Score  s : alist)
//		{
			s.setTot(s.getEng()+s.getEng()+s.getKor());
			s.setAvg((double)s.getTot()/3);
			
			if(s.avg >= 90) s.setHak('A') ;
			else if(s.avg >= 80) s.setHak('B') ;
			else if(s.avg >= 70) s.setHak('C') ;
			else if(s.avg >= 60) s.setHak('D') ;
			else s.setHak('F');
//		}
	}
}
