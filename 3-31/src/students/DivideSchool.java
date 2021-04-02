package students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DivideSchool 
{
	public static void ds(ArrayList<Student> list)
	{
		Map<String, List<Student>> map = list.stream().collect(Collectors.groupingBy(Student::getSchool, Collectors.toList()));
		for(String key: map.keySet())
		{
			map.get(key).stream().sorted(Comparator.comparing(Student::getSchoolClass).reversed().thenComparing(Student::getTot).reversed()).forEach(s->
			System.out.println("�б���:"+s.getSchool()+" ��:"+s.getSchoolClass()+" �̸�:"+s.getName()+" ����:"+s.getKor()+
					" ����:"+s.getEng()+" ����:"+s.getMat()+" ����:"+s.getSci()+" ����:"+s.getTot()
					+" ���:"+s.getAvg()+" ����:"+s.getGredes()+" ����:"+s.getOrder()));
			System.out.println("---------------------------------------------------------------------------------");
		}
	}
}
