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
			System.out.println("�̸� : "+s.name+" ����� :"+s.kor+
					" ����� :"+s.eng+" ���м��� :"+s.mat+" ���� :"+s.tot+" ��� :"+df.format(s.avg)+" ���� :"+s.hak);
		}
	
	}
}
