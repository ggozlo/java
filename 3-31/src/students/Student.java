package students;

import java.util.ArrayList;
import java.util.Scanner;

public class Student
{
	String school;
	int schoolClass;
	String name;
	int kor, eng,mat,sci,tot;
	double avg;
	char gredes;
	int order;
	
	public Student(String school, int schoolClass, String name, int kor, int eng, int mat, int sci)
	{
		this.school = school;
		this.schoolClass = schoolClass;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.sci = sci;
	}

	public static void run()
	{
		ArrayList<Student> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		StudenFileReader.sfr(list);
		StudentProcess.studentprocess(list);
		StudentOrder.studentorder(list);
		int select = 0;
		while(select != 5)
		{
			System.out.println("1.그냥출력, 2.반별 출력, 3.학교별 평균 출력,4.학교별 출력 ,5.종료");
			System.out.println("원하는 출력을 선택하시오");
			select = sc.nextInt();
			
			switch (select)
			{
			case 1:
				StudentOutPut.printStudents(list);
				
				break;
			case 2:
				StudentClassDivde.studentClassDivide(list);
				break;
			case 3:
				SchoolAverageTotal.sav(list);
				break;
			case 4:
				DivideSchool.ds(list);
			default:
				break;
			}
			
		}
			
	}
	
	
	
	
	
	public Student() {}

	public String getSchool() {return school;}
	public void setSchool(String school) {	this.school = school;}
	public int getSchoolClass() {	return schoolClass;}
	public void setSchoolClass(int schoolClass) {	this.schoolClass = schoolClass;}
	public String getName() {	return name;}
	public void setName(String name) {	this.name = name;}
	public int getKor() {	return kor;}
	public void setKor(int kor) {	this.kor = kor;}
	public int getEng() {	return eng;}
	public void setEng(int eng) {	this.eng = eng;}
	public int getMat() {	return mat;}
	public void setMat(int mat) {	this.mat = mat;}
	public int getSci() {	return sci;	}
	public void setSci(int sci) {		this.sci = sci;	}
	public int getTot() {		return tot;	}
	public void setTot(int tot) {		this.tot = tot;	}
	public double getAvg() {		return avg;	}
	public void setAvg(double avg) {		this.avg = avg;	}
	public char getGredes() {		return gredes;	}
	public void setGredes(char gredes) {		this.gredes = gredes;	}	
	public int getOrder() {	return order;}
	public void setOrder(int order) {		this.order = order;	}
	
	
	
}
