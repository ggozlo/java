package com.ggozlo;

import java.util.Scanner;

class Credit 
{
	String str ;
	String sb;
	// �����ڸ� ���ؼ� �ڷ� �Է�, �ʱ�ȭ 
//	public Credit(String str) 
//	{
//		this.str = str;
//	}

	void out()
	{
		System.out.println("����� �ֹι�ȣ :"+ str );
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
		{sb = "��";}
		else {sb="��";}
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
