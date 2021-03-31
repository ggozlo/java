package javafinal;



import java.util.ArrayList;
import java.util.Scanner;

public class Score
{
	
	
	String name;
	int kor, eng, mat, tot;
	double avg;
	char hak;

	
	public static void run() 
	{
		ArrayList<Score> alist = new ArrayList<Score>();
		Scanner sc = new Scanner(System.in);
		ScoreInput si = new ScoreInput();
		ScoreOutput so = new ScoreOutput();
		ScoreProcess sp = new ScoreProcess();
		while(true)
		{
			System.out.println("1: �Է�, 2:���, 3:���");
			int select = sc.nextInt();
			if(select ==1) 	si.Input(alist);
			else if(select == 2) so.showInfo(alist);
//			else if(select == 3) ScoreProcess.scoreprocess(alist);
			else {sc.close(); break;}
		}
	}
	
//	public void input(Score ss) throws IOException 
//	{
//		System.out.print("�̸��� �Է��Ͻÿ�");
//		name= sc.next();
//		System.out.print("������� �Է��Ͻÿ�");
//		kor= sc.nextInt();
//		System.out.print("������� �Է��Ͻÿ�");
//		eng= sc.nextInt();
//		System.out.print("���м����� �Է��Ͻÿ�");
//		mat= sc.nextInt();
//	}

	
	
	public Score()
	{
		super();
	}
	

	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getKor()
	{
		return kor;
	}
	public void setKor(int kor) 
	{
		this.kor = kor;
	}
	public int getEng() 
	{
		return eng;
	}
	public void setEng(int eng) 
	{
		this.eng = eng;
	}
	public int getMat() 
	{
		return mat;
	}
	public void setMat(int mat) 
	{
		this.mat = mat;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public char getHak() {
		return hak;
	}

	public void setHak(char hak) {
		this.hak = hak;
	}

	@Override
	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + "]";
	}
	
	
	
}
