package javafinal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class ScoreInput
{
	public void Input(ArrayList<Score> alist) 
	{
		try 
		{
			FileReader fr = new FileReader("E:/Test2.txt");

			BufferedReader br = new BufferedReader(fr);
			while(true)
			{
				Score ss = new Score();
				String str = br.readLine();
				if(str ==null) break;
				ss.name = str.substring( 0,3);
				ss.kor = Integer.parseInt(str.substring(3, 6));
				ss.eng = Integer.parseInt(str.substring(6, 9));
				ss.mat = Integer.parseInt(str.substring(9,12));	

				alist.add(ss);
				ScoreProcess.scoreprocess(ss);
			}
			br.close();
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
