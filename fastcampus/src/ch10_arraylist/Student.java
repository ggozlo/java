package ch10_arraylist;

import java.util.ArrayList;

public class Student 
{
	String name;
	int num;
	ArrayList<Subject> subjcetList = new ArrayList<Subject>();
	
	public Student(int num, String name)
	{
		this.name =name;
		this.num = num;
	}
	
	public void addSubject(String subjectName, int score)
	{
		subjcetList.add(new Subject(subjectName, score));
	}
	
	public void showStudentInfo()
	{
		int tot =0;
		for(Subject s : subjcetList)
		{
			System.out.println("학생 "+name+"의 "+s.getSubjectName()+"과목 성적은"+s.getScore()+"입니다.");
			tot += s.getScore();
		}
		System.out.println("학생 "+name+"의 총점은"+tot+"입니다.");
	}
}
