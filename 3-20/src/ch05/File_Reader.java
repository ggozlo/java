package ch05;

import java.io.*;
import java.io.ObjectInputStream.GetField;

public class File_Reader 
{
	public static void main(String[] args) throws IOException 
	{
		FileReader fis = new FileReader("E:/JEEW/txt.txt");
		BufferedReader br = new BufferedReader(fis);
		int cursor; //  
		int [] kor = new int[5];
		int [] eng = new int[5];
		int [] mat = new int[5];
		int i = 0;
		String [] name = new String[5];
		
		while(true)
		{
			String temp =  br.readLine();

			if(temp == null) break;

			
			try 
			{
				name[i] = temp.substring(0, 3);
				kor[i] = Integer.parseInt(temp.substring(3, 6));
				eng[i] = Integer.parseInt(temp.substring(6, 9));
				mat[i] = Integer.parseInt(temp.substring(9, 12));
				
				if(kor[i] > 100 || eng[i] >100 || mat[i] >100)
				{
					throw new Exception("점수는 100점을 초과할수 없습니다.");
				}
				else if(kor[i] < 0 || eng[i] <0 || mat[i] <0)
				{
					throw new Exception("점수는 0보다 작을수 없습니다.");
				}
				
				System.out.println(name[i]+"\t"+kor[i]+"\t"+eng[i]+"\t"+mat[i]);
				

				
			}
			catch(NumberFormatException e)
			{
				System.out.println("잘못된 입력양식입니다"+e.getMessage());
				continue;
			}
			catch (ArrayIndexOutOfBoundsException e) 
			{
				System.out.println("배열범위 초과" + e.getMessage());
			}
			catch (Exception e) 
			{
				System.out.println(e.getMessage());
			}
			i++;
		}

		System.out.println("fin");
	}
}
