package sample;

import java.util.Scanner;

public class Sample2 {

	public static void main(String[] args)
	{
		while(true)
		{
			System.out.print("�̸��� �Է��Ͻÿ�");
			Scanner sc = new Scanner(System.in);
			String name = sc.next();
			
			System.out.println(name);
			
			System.out.print("��� �Է��ϰڽ��ϱ�?(Y/N)");
			String yn = sc.next();
			System.out.println(yn.hashCode());
//			if(yn.equals("N") || yn.equals("y") ) 
//			{
//				break; 
//			}
		
		}
//		System.out.println("����");
	}

}
				  			