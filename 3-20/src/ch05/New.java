package ch05;

import java.util.InputMismatchException;
import java.util.Scanner;


public class New {

	public static void main(String[] args)
	{
		System.out.print("���� �Է��ϼ��� : ");
		Scanner sc = new Scanner(System.in);
		
		try{
			int i = sc.nextInt();
			System.out.println(23/i);
		}
		catch (InputMismatchException e)
		{
			System.out.println("���ڸ� �Է��Ͻÿ�"+e.getMessage());
		}
		catch (Exception e) {
			System.out.println("�����?" + e.getMessage());
		}



	}
}
