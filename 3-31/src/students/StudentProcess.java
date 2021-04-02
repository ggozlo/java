package students;

import java.util.ArrayList;

public class StudentProcess 
{
	public static void studentprocess(ArrayList<Student> list)
	{
		for(Student s : list)
		{
			s.setTot( s.getKor() + s.getEng() + s.getMat() + s.getSci() );
			s.setAvg(  s.getTot() / 4.  );
			if( s.getAvg() >=90 ) s.setGredes('A');
			else if( s.getAvg() >=80 ) s.setGredes('B');
			else if( s.getAvg() >=70 ) s.setGredes('C');
			else if( s.getAvg() >=60 ) s.setGredes('D');
			else  s.setGredes('F');
				
		}
	}
}
