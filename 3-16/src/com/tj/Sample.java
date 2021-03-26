package com.tj;

import java.util.Scanner;

class Score 
{
	String name;
	int kor ,eng, mat , tot;
	double avg ;
	char grade ;
	
	public Score()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public Score(String name, int kor, int eng, int mat) 
	{
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getTot() {
		return tot;
	}


	public double getAvg() {
		return avg;
	}


	public char getGrade() {
		return grade;
	}

	int total() 
	{
		tot = kor + eng + mat ;
		return  tot ;
	}
	
	double average() 
	{
		avg = (double)total() / 3 ;
		return avg ;
	}
	
	char unit()
	{
		if (avg >= 90) grade = 'A' ;
		else if (avg >= 80) grade = 'B';
		else if (avg >= 70) grade = 'C';
		else if (avg >= 60) grade = 'D' ;
		else grade = 'F';
		return grade ;
	}
	
	void ptr()
	{
		System.out.println("�̸�" + name);
		System.out.println("����"+kor);
		System.out.println("����" + eng);
		System.out.println("����"+mat);
		System.out.println("����"+tot);
		System.out.println("���"+String.format("%.2f", avg));
		System.out.println("����"+grade);
	}
}

public class Sample
{

	public static void main(String[] args)
	{
		Score ss = new Score();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		ss.setName(sc.next());
		System.out.print("���� :");
		ss.setKor(sc.nextInt());
		System.out.print("���� :");
		ss.setEng(sc.nextInt());
		System.out.print("���� :");
		ss.setMat(sc.nextInt());
		sc.close();
		
		ss.total();
		ss.average();
		ss.unit();
		
		ss.ptr() ;
	}
}
