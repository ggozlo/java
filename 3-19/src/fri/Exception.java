package fri;

import java.util.Scanner;


public class Exception {

	public static void main(String[] args)
	{
		System.out.print("수를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		
		try{
			int i = sc.nextInt();
			System.out.println(23/i);
		}
		catch (ArithmeticException e)
		{
			System.out.println("잘못된 수를 입력했습니다");
		}


	}
}















