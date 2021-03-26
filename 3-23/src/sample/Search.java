package sample;

import java.util.*;
public class Search 
{	
	public static void main(String[] args)
	{
		String [] name = {"관악산","명지산","한라산","북한산","금강산","화악산","용문산","금오산"};
	
		Scanner sc = new Scanner(System.in);
		System.out.print("찾을려는 산의 이름을 입력하시오 :");
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
			System.out.println(target +" 목록에 있는산 입니다.");
		}
		else 
		{
			System.out.println(target + " 목록에 없는산 입니다.");
		}
	}
	


}
