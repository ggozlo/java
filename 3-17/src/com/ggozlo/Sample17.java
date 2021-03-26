package com.ggozlo;

import java.util.Scanner;

class Credit 
{
	String str ;
	String sb;
	// 생성자를 통해서 자료 입력, 초기화 
//	public Credit(String str) 
//	{
//		this.str = str;
//	}

	void out()
	{
		System.out.println("당신의 주민번호 :"+ str );
	}

	public String getStr() 
	{
		return str;
	}

	public void setStr(String str)
	{
		this.str = str;
	}
	
	void gender()
	{
		if(str.charAt(7)=='1' || str.charAt(7)=='3')
		{sb = "남";}
		else {sb="여";}
	}


}
public class Sample17 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Credit cr = new Credit();
		// cr.str = "990210-1183119" ;
		String cn = sc.next(); 
		cr.setStr(cn);
		
		cr.out();
		cr.gender();
		System.out.println(cr.sb);

	}

}
