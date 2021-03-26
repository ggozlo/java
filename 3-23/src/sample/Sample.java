package sample;

import java.util.*;
public class Sample 
{
	public static void main(String[] args)
	{
		String [] name = {"관악산","명지산","한라산","북환산","금강산","화악산","용문산","금오산"};

		
		for(String k: name)
		{
			System.out.println(k);
		}
		
		System.out.println("=======================");
		// 정렬
		Arrays.sort(name, Collections.reverseOrder());
		
		for(String k: name)
		{
			System.out.println(k);
		}
	}
}
