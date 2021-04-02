package students;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SchoolAverageTotal 
{
	public static void sav(ArrayList<Student> list)
	{
		DecimalFormat df = new DecimalFormat("#0.#");
		Map<String, Double> alist = list.stream()
				.collect(Collectors.groupingBy(Student::getSchool,Collectors.averagingDouble(Student::getAvg)));
		for(String key:alist.keySet())
		{
			System.out.println(key+" ЦђБе :"+df.format( alist.get(key)));
		}
	}
}
