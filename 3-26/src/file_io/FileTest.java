package file_io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileTest 
{
	public static void main(String[] args) throws	IOException
	{
		FileReader fr = new FileReader("E:/Test.txt");
		BufferedReader br = new BufferedReader(fr);
		while(true)
		{
			String line = br.readLine();
			if(line == null) break;
			
			String name = line.substring(0, 3);
			int age = Integer.parseInt(line.substring(3, 6));
			
		}
	}
}
