package fri;

class Adress 
{
	String name;
	String number;
	
	public Adress(String name, String number) 
	{
		super();
		this.name = name;
		this.number = number;
	}
	
	
	// �̸�, ��ȭ��ȣ 
}

class Score extends Adress
{
	// ���� , ����, ����
	int kor, eng, mat, tot, grade;
	double avg;
	
	public Score(String name, String number, int kor, int eng, int mat)
	{
		super(name, number);
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	int total()
	{
		 
		return kor + eng + mat;
	}
	
	double average()
	{
		return total() / 3;
	}
	
}



public class Project1 {
   public static void main(String[] args) 
   {
	   String [][] name = new String [5][2];
	   int [][] score = new int[5][7];
	   
	   name[0][0] = "��λ�";
	   name[0][1] = "111-1234";
	   name[1][0] = "�����";
	   name[1][1] = "1111-2222";
	   name[2][0] = "��浿";
	   name[2][1] = "1234-1234";
	   name[3][0] = "�Ѹ�";
	   name[3][1] = "1212-1212";
	   name[4][0] = "¯��";
	   name[4][1] = "9999-9999";

	   int i;
	   
	   for(i=0;i<name.length;i++)
	   {
		   System.out.println(name[i][0]+"\t"+name[i][1]);
	   }
   }
}