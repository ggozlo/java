package test5;

import java.util.Scanner;
import java.util.*;

public class Test {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		boolean token = false;
		double quotient = 0;
		int dividend =0;
		
		do
		{
			try
			{
				System.out.print("�������� ���� �Է��Ͻÿ�");
				dividend = sc.nextInt();
				
				System.out.print("������ ���� �Է��Ͻÿ�");
				int divisor = sc.nextInt();
				

				quotient = dividend / divisor;
				token = false;
				
			}
			catch(ArithmeticException e)
			{
				System.out.println("0���� ���������� �����ϴ�!");
				token = true;
			}
			catch(InputMismatchException e)
			{
				System.out.println("�Է� ����� �߸��Ǿ���ϴ�!");
			}
	
		}while(token);
	
	System.out.println(quotient);

	
	sc.close();
	}
	

}
