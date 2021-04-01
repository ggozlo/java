package javafinal;

import java.util.Scanner;

public class DataInput
{
	public String StringInput(Scanner sc) 
	{
		System.out.print("이름을 입력하시오");
		String name = sc.next();

		return name; 
		
	}
	
	public int IntegerInput(String subject, Scanner sc)
	{
		System.out.print(subject + " 과목 점수 입력");
		int score = sc.nextInt();

		return score;
	}
}
