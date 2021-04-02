package students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentOrder
{
	static int i=1;
	public static void studentorder(ArrayList<Student> list)
	{
		
//		list.stream().sorted(Comparator.comparing(Student::getTot)).forEach( s->{ s.setOrder(++i); } ); // 전체정렬
		
		Map<String, List<Student>> smap = list.stream()
				.collect(Collectors.groupingBy(Student::getSchool, Collectors.toList()));
		
		for(String key : smap.keySet())
		{
			
			smap.get(key).stream().sorted(Comparator.comparing(Student::getTot).reversed()).forEach(s-> 
			{  s.setOrder(i++); });
			i=1;
		}
	}
}
