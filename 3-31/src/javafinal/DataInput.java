package javafinal;

import java.util.Scanner;

public class DataInput
{
	public String StringInput(Scanner sc) 
	{
		System.out.print("�̸��� �Է��Ͻÿ�");
		String name = sc.next();

		return name; 
		
	}
	
	public int IntegerInput(String subject, Scanner sc)
	{
		System.out.print(subject + " ���� ���� �Է�");
		int score = sc.nextInt();

		return score;
	}
}
