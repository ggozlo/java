package fri;

import java.util.Scanner;


public class Exception {

	public static void main(String[] args)
	{
		System.out.print("���� �Է��ϼ��� : ");
		Scanner sc = new Scanner(System.in);
		
		try{
			int i = sc.nextInt();
			System.out.println(23/i);
		}
		catch (ArithmeticException e)
		{
			System.out.println("�߸��� ���� �Է��߽��ϴ�");
		}


	}
}















