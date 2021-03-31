package fileIo;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO 
{
	
	static String str = "start\n";
	
	public static void read() throws IOException 
	{
		FileReader fis = new FileReader("E:/Test.txt");
		BufferedReader bis = new BufferedReader(fis);
		
		while(true)
		{
			int a=bis.read();
			if(a== -1) break;

			str += (char)a;
		}
	}
	
	public static void write() throws IOException
	{
		FileWriter fw = new FileWriter("E:/Test1.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		System.out.println(str);

		bw.write(str);
		bw.flush();
		bw.close();
	}
}
