package javafinal;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class SearchScore 
{
	public static void search(Scanner sc, ArrayList<Score> list)
	{
		DecimalFormat df = new DecimalFormat("#0.#");
		System.out.println("찾는 학생을 입력하시오 :");
		String name = sc.next();
		list.stream().filter(s -> s.getName().contains(name))
		.forEach(s -> System.out.println(s.getName() + " 평균 : "+df.format(s.getAvg())+" 학점 : "+ s.getHak()));
	}
}
