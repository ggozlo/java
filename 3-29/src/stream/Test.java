package stream;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ArrayList<Korea> list = new ArrayList<Korea>();
		list.add(new Korea("백두산", 20,70));
		list.add(new Korea("관악산", 15,70));
		list.add(new Korea("전라도", 60,70));
		list.add(new Korea("한라산", 88,60));
		list.add(new Korea("관악산", 97,60));
		list.add(new Korea("문왕산", 97,70));
		
//		List<Korea> list =  Arrays.asList(
//				new Korea("백두산", 20,50),
//				new Korea("관악산", 15,70),
//				new Korea("북한산", 60,78),
//				new Korea("한라산", 88,56),
//				new Korea("금강산", 97,89));
		
//		for(Korea k : list)
//		{
//			System.out.println(k.toString());
//		}
//		System.out.println("Lambda");
//		list.forEach(s -> {System.out.println(s.toString());});
		
//		System.out.println("이더레이터");
//		Iterator<Korea> it = list.iterator();
//		while(it.hasNext())
//		{
//			Korea s = it.next();
//			System.out.println(s.toString());
//		}
//		
//		System.out.println("스트림");
//		Stream<Korea> st = list.stream();
//		st.forEach( s -> 
//		{  	String name = s.getName();
//			int age = s.getAge();
//			int score = s.getScore();
//			System.out.println(name+age+score); } );
		
		//점수 평균                  정수를 가져옴 타겟 클래스 메쏘드    평균 구하기  더블형태로(필수)
//		double avg = list.stream().mapToInt(Korea :: getScore).average().getAsDouble();
//		System.out.println(avg);
//		DecimalFormat df = new DecimalFormat("#,##0.##");
//		System.out.println(df.format(avg));
//		
//		// 점수 합
//		int tot = list.stream().mapToInt(Korea :: getScore).sum();
//		System.out.println(tot);

//		//관악산 평균나이
//		double average = list.stream().filter(m -> m.getName()=="관악산").mapToInt(Korea::getAge).average().getAsDouble();
//		System.out.println(average);
		
//		// 관악산 이면서 점수가 65이상 
//		double mmage = list.stream().filter(m -> m.getName()=="관악산" && m.getScore() >=65 ).mapToInt(Korea::getAge).average().getAsDouble();
//		System.out.println(mmage);
		
		// 오름차순 정렬
		List<Korea> blist = list.stream().sorted(Comparator.comparing(Korea :: getAge).reversed()).collect(Collectors.toList());
		for(Korea k : blist)
		{
			System.out.println(k.toString());
		}
		
		//내림차순 정렬
		list.stream().sorted(Comparator.comparing(Korea :: getName).reversed()).forEach(s-> System.out.println(s.toString()));
	}

}
