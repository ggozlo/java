package test2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test 
{

	public static void main(String[] args) throws IOException 
	{
		Scanner sc = new Scanner(System.in);
		FileReader fr = new FileReader("E:/Test.txt");
		BufferedReader br = new BufferedReader(fr);
		ArrayList<Score> al = new ArrayList<Score>();
		String data;
		
		while(true)
		{
			data = br.readLine();
			if(data == null) break;
			al.add(new Score(data));
		}
		
		Collections.sort(al);

//		al.forEach(s -> System.out.println(s.toString()));
		
		String sname = "¿Ã±‚¿⁄";
				
		for(Score ss : al )		
		System.out.println(ss.name.equals(sname));

	}

}
