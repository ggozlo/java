package test1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class List1
{
	public static void main(String[] args) throws IOException
	{
		ArrayList<Score> list = new ArrayList<Score>();

		FileReader fr = new FileReader("E:/Test.txt");
		BufferedReader br = new BufferedReader(fr);
		while(true)
		{
			String line = br.readLine();
			if(line == null) break;
			
			String name = line.substring(0, 3);
			int age = Integer.parseInt(line.substring(3, 6));
			list.add(new Score(name,age));
		}
		
		Collections.sort(list);
		
//		for(Score k:list)
//		{
//			System.out.println(k.toString());
//		}
		System.out.println("===========================");
//		for(int i=0;i<list.size();i++)
//		{
//			Score p = list.get(i);
//			System.out.println(p.toString());
//		}
//		
		list.forEach(p -> System.out.println(p.toString()));
		
//		ArrayList<Score> list1 = new ArrayList<Score>();
//		list1.addAll(list);
		
//		System.out.println("++++¶÷´Ù++++");
//		list.forEach(s->System.out.println(s.toString()));
	}
}
