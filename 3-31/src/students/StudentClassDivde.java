package students;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentClassDivde
{
	public static void studentClassDivide(ArrayList<Student> list)
	{

	
		Map<String, Map<Integer, List<Student>>> slist =  list.stream()
				.collect(Collectors.groupingBy(Student::getSchool, Collectors.groupingBy(Student::getSchoolClass, Collectors.toList())));

		for(String key : slist.keySet())
		{
			Map<Integer, List<Student>> clist = slist.get(key);
			for(int ikey : clist.keySet())
			{
				clist.get(ikey).stream().sorted(Comparator.comparing(Student::getTot)).forEach(s->
				System.out.println("학교명:"+s.getSchool()+" 반:"+s.getSchoolClass()+" 이름:"+s.getName()+" 국어:"+s.getKor()+
						" 영어:"+s.getEng()+" 수학:"+s.getMat()+" 과학:"+s.getSci()+" 총점:"+s.getTot()
						+" 평균:"+s.getAvg()+" 학점:"+s.getGredes()+" 석차:"+s.getOrder()));
				System.out.println("--------------------------------------------------------------------------------------------");
			}
			System.out.println("==========================================================================================");
		}
	}
}
