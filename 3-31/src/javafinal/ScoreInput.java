package javafinal;

import java.util.ArrayList;
import java.util.Scanner;

public class ScoreInput
{
	public void Input(ArrayList<Score> alist,Scanner sc) 
	{
		DataInput di = new DataInput();
//		try 
//		{
//			FileReader fr = new FileReader("E:/Test2.txt");
//
//			BufferedReader br = new BufferedReader(fr);
//			while(true)
//			{
				Score ss = new Score();
//				String str = br.readLine();
//				if(str ==null) break;
//				ss.name = str.substring( 0,3);
//				ss.kor = Integer.parseInt(str.substring(3, 6));
//				ss.eng = Integer.parseInt(str.substring(6, 9));
//				ss.mat = Integer.parseInt(str.substring(9,12));	

				
//				System.out.print("�̸��� �Է��Ͻÿ�");
//				ss.setName(sc.next());
//				System.out.print("���������� �Է��Ͻÿ�");
//				ss.setKor(sc.nextInt());
//				System.out.print("���������� �Է��Ͻÿ�");
//				ss.setEng(sc.nextInt());
//				System.out.print("���м����� �Է��Ͻÿ�");
//				ss.setKor(sc.nextInt());
				String name = di.StringInput(sc);
				ss.setName(name);
				ss.setKor(di.IntegerInput("����",sc));
				ss.setEng(di.IntegerInput("����",sc));
				ss.setMat(di.IntegerInput("����",sc));
				alist.add(ss);
				ScoreProcess.scoreprocess(ss);
//			}
//			br.close();
//		} 
//		catch (Exception e) 
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}
