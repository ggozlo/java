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
				System.out.print("나누어질 수를 입력하시오");
				dividend = sc.nextInt();
				
				System.out.print("나누는 수를 입력하시오");
				int divisor = sc.nextInt();
				

				quotient = dividend / divisor;
				token = false;
				
			}
			catch(ArithmeticException e)
			{
				System.out.println("0으로 나누어질수 없습니다!");
				token = true;
			}
			catch(InputMismatchException e)
			{
				System.out.println("입력 양식이 잘못되어습니다!");
			}
	
		}while(token);
	
	System.out.println(quotient);

	
	sc.close();
	}
	

}
