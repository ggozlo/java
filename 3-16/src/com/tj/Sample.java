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
		System.out.println("이름" + name);
		System.out.println("국어"+kor);
		System.out.println("영어" + eng);
		System.out.println("수학"+mat);
		System.out.println("총점"+tot);
		System.out.println("평균"+String.format("%.2f", avg));
		System.out.println("학점"+grade);
	}
}

public class Sample
{

	public static void main(String[] args)
	{
		Score ss = new Score();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		ss.setName(sc.next());
		System.out.print("국어 :");
		ss.setKor(sc.nextInt());
		System.out.print("영어 :");
		ss.setEng(sc.nextInt());
		System.out.print("수학 :");
		ss.setMat(sc.nextInt());
		sc.close();
		
		ss.total();
		ss.average();
		ss.unit();
		
		ss.ptr() ;
	}
}
