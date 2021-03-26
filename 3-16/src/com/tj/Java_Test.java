package com.tj; //DTO==vo -> DAO

import java.util.Scanner;

class Account 
{
	String id, pw ;

	
	public Account() // default »ý¼ºÀÚ
	{
		super();
	}
	
	public Account(String id, String pw) 
	{
		super();
		this.id = id;
		this.pw = pw;
	}

	public String getId() {	return id;}
	public void setId(String id) {this.id = id;}
	public String getPw() {	return pw;	}
	public void setPw(String pw) {	this.pw = pw;}
}

public class Java_Test
{
	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		String id1 =  sc.next();
		String pw1 = sc.next();
		sc.close();
		Account ac = new Account();
		ac.setId(id1);
		ac.setPw(pw1);
		
		
		System.out.println(ac.getId());
		System.out.println(ac.getPw());
	}

}
