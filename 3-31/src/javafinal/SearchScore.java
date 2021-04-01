package javafinal;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class SearchScore 
{
	public static void search(Scanner sc, ArrayList<Score> list)
	{
		DecimalFormat df = new DecimalFormat("#0.#");
		System.out.println("ã�� �л��� �Է��Ͻÿ� :");
		String name = sc.next();
		list.stream().filter(s -> s.getName().contains(name))
		.forEach(s -> System.out.println(s.getName() + " ��� : "+df.format(s.getAvg())+" ���� : "+ s.getHak()));
	}
}
