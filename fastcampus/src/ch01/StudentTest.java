package ch01;


public class StudentTest
{

	public static void main(String[] args)
	{
		Student studentLee = new Student(123, "Lee");
		studentLee.setKoreaSubject("����", 99);
		studentLee.setMathSubject("����", 89);
		
		Student studentKim = new Student(123, "Kim");
		studentKim.setKoreaSubject("����", 23);
		studentKim.setMathSubject("����", 46);
		
		studentLee.showScoreInfo();
		studentKim.showScoreInfo();
		
	}

}
