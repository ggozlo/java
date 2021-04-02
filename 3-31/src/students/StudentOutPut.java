package students;

import java.util.ArrayList;

public class StudentOutPut
{
	public static void printStudents(ArrayList<Student> list)
	{
		list.stream().forEach(s->
		System.out.println("학교명:"+s.getSchool()+" 반:"+s.getSchoolClass()+" 이름:"+s.getName()+" 국어:"+s.getKor()+
				" 영어:"+s.getEng()+" 수학:"+s.getMat()+" 과학:"+s.getSci()+" 총점:"+s.getTot()
				+" 평균:"+s.getAvg()+" 학점:"+s.getGredes()+" 석차:"+s.getOrder()));
	}
}
