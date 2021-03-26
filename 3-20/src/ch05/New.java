package ch05;

import java.util.InputMismatchException;
import java.util.Scanner;


public class New {

	public static void main(String[] args)
	{
		System.out.print("수를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		
		try{
			int i = sc.nextInt();
			System.out.println(23/i);
		}
		catch (InputMismatchException e)
		{
			System.out.println("숫자를 입력하시오"+e.getMessage());
		}
		catch (Exception e) {
			System.out.println("어떤에러?" + e.getMessage());
		}



	}
}
