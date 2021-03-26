package com.ggozlo;

import java.util.Scanner;

class Birthday
{
	String SocialNumber, gender;
	int year, month, day ;
	
	public Birthday(String socialNumber)
	{
		SocialNumber = socialNumber;
	}
	
	void Birth()
	{
		year = Integer.parseInt(SocialNumber.substring(0,2)) + 1900;
		month = Integer.parseInt(SocialNumber.substring(2,4));
		day = Integer.parseInt(SocialNumber.substring(4,6));
	}
	
	void age()
	{
		int age = 2021 - year;
	}
	void gender()
	{
		if(SocialNumber.charAt(7) == '1' )
		{
			gender = "남";
		}
		else
		{
			gender = "여";
		}
	}
	void ptr()
	{
		Birth();
		age();
		gender();
		System.out.println(SocialNumber);
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(gender);
	}
}


public class Sample2
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("주민번호 입력:");
		String SocialSecurityNumber = sc.next();
		Birthday bd = new Birthday(SocialSecurityNumber);
		
		sc.close();
		bd.ptr();

	}

}
