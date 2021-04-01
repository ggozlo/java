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

				
//				System.out.print("이름을 입력하시오");
//				ss.setName(sc.next());
//				System.out.print("국어점수를 입력하시오");
//				ss.setKor(sc.nextInt());
//				System.out.print("영어점수를 입력하시오");
//				ss.setEng(sc.nextInt());
//				System.out.print("수학성적을 입력하시오");
//				ss.setKor(sc.nextInt());
				String name = di.StringInput(sc);
				ss.setName(name);
				ss.setKor(di.IntegerInput("국어",sc));
				ss.setEng(di.IntegerInput("영어",sc));
				ss.setMat(di.IntegerInput("수학",sc));
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
