package test2;

import java.text.DecimalFormat;

//반별 오름차순, 이름별 내림차순
public class Score implements Comparable<Score>
{
	int schoolClass;
	String name;
	int kor,eng,mat,tot;
	double avg;
	char grade;
	
	public Score(String data)
	{
		this.schoolClass = Integer.parseInt(data.substring(0, 1));
		this.name = data.substring(1, 4);
		this.kor = Integer.parseInt(data.substring(4, 7));
		this.eng = Integer.parseInt(data.substring(7, 10));
		this.mat = Integer.parseInt(data.substring(10, 13));
		this.tot = tot();
		this.avg = avg();
		this.grade = grade();
	}
	
	int tot()
	{
		return kor+eng+mat;
	}
	double avg()
	{
		return (Math.round((double)tot()/3*100)) / 100.0 ;
	}
	char grade()
	{
		if(avg >= 90) return 'A';
		else if(avg >= 80) return 'B';
		else if(avg >= 70) return 'C';
		else if(avg >= 60) return 'D';
		else  return 'F';
	}

	@Override
	public int compareTo(Score o)
	{
		if(this.schoolClass > o.schoolClass)
		{
			return 1;
		}
		else if(this.schoolClass == o.schoolClass)
		{
			if(this.tot>o.tot) return -1;
			else return 1;
		}
		else
		{
			return -1;
		}

	}

	@Override
	public String toString() {
		
		DecimalFormat df = new DecimalFormat("000");
		
		return  + schoolClass + "반 이름:" + name + ", 국어:" + df.format(kor) + ", 영어:" + df.format(eng) + ", 수학:" + df.format(mat)
				+ ", 총점:" + tot + ", 평균:" +avg + ", 학점:" + grade ;
	}


	

	
	
}
