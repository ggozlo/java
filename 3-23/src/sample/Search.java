package sample;

import java.util.*;
public class Search 
{	
	public static void main(String[] args)
	{
		String [] name = {"���ǻ�","������","�Ѷ��","���ѻ�","�ݰ���","ȭ�ǻ�","�빮��","�ݿ���"};
	
		Scanner sc = new Scanner(System.in);
		System.out.print("ã������ ���� �̸��� �Է��Ͻÿ� :");
		String target = sc.next();
//		int p = 0;
		boolean pp = false;
//		int index = Arrays.binarySearch(name, sc.next());
//		System.out.println(index);
//		System.out.println(name[index]);
		
		for(String i : name)
		{
			if(i.contains(target))
			{
				System.out.println(i);
				//p++;
				pp = true;
			}
		}
		if(pp)
		{
			System.out.println(target +" ��Ͽ� �ִ»� �Դϴ�.");
		}
		else 
		{
			System.out.println(target + " ��Ͽ� ���»� �Դϴ�.");
		}
	}
	


}
