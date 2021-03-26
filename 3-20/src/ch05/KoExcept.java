package ch05;

import java.util.Scanner;

class KE extends Exception
{

	public KE(String message)
	{
		super(message);
	}
	
}

class Info
{
	String name;
	int kor, eng, mat;
	
	public Info(String data) 
	{
		this.name = data.substring(0, 3);
		this.kor = Integer.parseInt(data.substring(4, 7));
		this.eng = Integer.parseInt(data.substring(8, 11));
		this.mat = Integer.parseInt(data.substring(12, 15));
	}

	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMat() {
		return mat;
	}

	@Override
	public String toString() {
		return "Info [name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + eng;
		result = prime * result + kor;
		result = prime * result + mat;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	
}

public class KoExcept 
{
	int sum = 0;
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in); // 이름, 국어, 영어, 수학

		
		try 
		{
			System.out.print("이름, 국어, 영어, 수학 입력 (ex:홍길동,100,099,009):");
			Info info = new Info(sc.next());
		
			if(info.getEng() > 100 || info.getKor() > 100 || info.getMat() > 100)
			{
				throw new KE("점수는 100을 초과할수 없습니다.");
			}
			System.out.println(info.toString());
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}

		
			
		

	}
}
