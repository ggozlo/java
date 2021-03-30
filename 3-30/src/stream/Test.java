package stream;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Comparator;
import java.util.stream.Collectors;

import stream.Sample.city;
import stream.Sample.gender;

public class Test
{

	public static void main(String[] args) 
	{
		ArrayList<Sample> sp = new ArrayList<Sample>();
		sp.add(new Sample(gender.MALE, city.SEOUL, "Kim", 70));
		sp.add(new Sample(gender.FEMALE, city.BUSAN, "Park", 90));
		sp.add(new Sample(gender.MALE, city.BUSAN, "Yang", 60));
		sp.add(new Sample(gender.FEMALE, city.SEOUL, "Lee", 80));
		sp.add(new Sample(gender.MALE, city.SEOUL, "Moon", 50));
		sp.add(new Sample(gender.MALE, city.BUSAN, "Noh", 100));
		sp.add(new Sample(gender.FEMALE, city.SEOUL, "Jo", 10));
		sp.add(new Sample(gender.FEMALE, city.SEOUL, "Ahn", 40));
		sp.add(new Sample(gender.MALE, city.BUSAN, "Shin", 30));
		
//		sp.stream().sorted(Comparator.comparing(Sample::getKor)).forEach(s -> System.out.println(s.toString()));
		List<Sample> ls = sp.stream().sorted(Comparator.comparing(Sample::getName)).collect(Collectors.toList());
//		ls.forEach(l-> System.out.println(l.toString()));
		
//		System.out.println("================남자만===============");
//		ArrayList<Sample> al = (ArrayList<Sample>) sp.stream().filter(s -> s.getGd() == gender.MALE).collect(Collectors.toList());
//		al.forEach(l->System.out.println(l.toString()));
//		System.out.println("================여자만===============");
//		sp.stream().filter(s-> s.getGd() == gender.FEMALE).forEach(s -> System.out.println(s.toString()));
		
//		Map<gender, List<Sample>> msl = ls.stream().collect(Collectors.groupingBy(Sample::getGd));
//		msl.get(gender.MALE).stream().forEach(m->System.out.println(m));
		
		double avg = ls.stream().filter(l->l.getGd() == gender.MALE).mapToInt(Sample :: getKor).average().getAsDouble();
		System.out.println(avg);
		double avgf = ls.stream().filter(l-> l.getGd() == gender.FEMALE).mapToInt(Sample :: getKor).average().getAsDouble();
		System.out.println(avgf);
		
		//
		
//		Map<gender, Double> maptest = ls.stream()
//				.collect(Collectors.groupingBy(Sample::getGd,Collectors.averagingDouble(Sample::getKor))); // 스트림 연산으로 평균값을 구하여 성별과 매칭
		
//		Map<gender, List<Sample>> mssl = ls.stream().collect(Collectors.groupingBy(Sample::getGd)); // 리스트를 성별로 그룹화 하여 엔트리 생성
//		double avgg = mssl.get(gender.MALE).stream().mapToInt(Sample :: getKor).average().getAsDouble(); // 남성 그룹 호출, 스트림 평균계산
		
		
//		Map<gender, List<Sample>> gdname = ls.stream().collect(Collectors.groupingBy(Sample::getGd));
//		gdname.get(gender.MALE).stream().forEach(s->System.out.println(s.toString()));

//		Map<Sample.city, List<Sample>> ct = ls.stream().collect(Collectors.groupingBy(Sample::getCt));
//		ct.get(city.SEOUL).stream().forEach(s->System.out.println(s.toString()));

		int sum = ls.stream().filter(l-> l.getCt() == city.SEOUL && l.getGd() == gender.MALE).mapToInt(Sample :: getKor).sum();
		System.out.println(sum);
		
		int sum2 = ls.stream().filter(l-> l.getCt() == city.SEOUL && l.getGd() == gender.MALE).mapToInt(Sample :: getKor).reduce(0,(a,b)->a+b);
		System.out.println(sum2);
		
		int sum3 = ls.stream().filter(l-> l.getCt() == city.SEOUL && l.getGd() == gender.MALE).map(Sample :: getKor).reduce((a,b)->a+b).get();
		System.out.println(sum3);
	}

}
