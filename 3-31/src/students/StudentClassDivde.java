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
				System.out.println("�б���:"+s.getSchool()+" ��:"+s.getSchoolClass()+" �̸�:"+s.getName()+" ����:"+s.getKor()+
						" ����:"+s.getEng()+" ����:"+s.getMat()+" ����:"+s.getSci()+" ����:"+s.getTot()
						+" ���:"+s.getAvg()+" ����:"+s.getGredes()+" ����:"+s.getOrder()));
				System.out.println("--------------------------------------------------------------------------------------------");
			}
			System.out.println("==========================================================================================");
		}
	}
}
