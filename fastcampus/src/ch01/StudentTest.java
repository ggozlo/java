package ch01;


public class StudentTest
{

	public static void main(String[] args)
	{
		Student studentLee = new Student(123, "Lee");
		studentLee.setKoreaSubject("국어", 99);
		studentLee.setMathSubject("수학", 89);
		
		Student studentKim = new Student(123, "Kim");
		studentKim.setKoreaSubject("국어", 23);
		studentKim.setMathSubject("수학", 46);
		
		studentLee.showScoreInfo();
		studentKim.showScoreInfo();
		
	}

}
