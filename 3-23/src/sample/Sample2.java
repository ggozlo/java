package sample;

import java.util.Scanner;

public class Sample2 {

	public static void main(String[] args)
	{
		while(true)
		{
			System.out.print("이름을 입력하시오");
			Scanner sc = new Scanner(System.in);
			String name = sc.next();
			
			System.out.println(name);
			
			System.out.print("계속 입력하겠습니까?(Y/N)");
			String yn = sc.next();
			System.out.println(yn.hashCode());
//			if(yn.equals("N") || yn.equals("y") ) 
//			{
//				break; 
//			}
		
		}
//		System.out.println("종료");
	}

}
				  			