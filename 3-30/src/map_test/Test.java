package map_test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Test {

	public static void main(String[] args)
	{
		HashMap<Integer, String> maplist = new HashMap<Integer, String>();
		maplist.put(1,"일요일");
		maplist.put(2,"월요일");
		maplist.put(3,"화요일");
		maplist.put(4,"수요일");
		maplist.put(5,"목요일");
		maplist.put(6,"금요일");
		maplist.put(7,"토요일");
		
		System.out.println("맵크기 "+maplist.size());
		Set<Integer> kset = maplist.keySet();
//		Iterator<Integer> it = kset.iterator();
//		while(it.hasNext())
//		{
//			Integer kk = it.next();
//			String sr = maplist.get(kk);
//			System.out.println(sr);
//			
//		}

		Scanner sc = new Scanner(System.in);
		int i = 1;
		while(i > 0)
		{
			i = sc.nextInt();
			System.out.println(maplist.get(i));
		}
	}

}
