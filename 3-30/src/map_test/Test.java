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
		maplist.put(1,"�Ͽ���");
		maplist.put(2,"������");
		maplist.put(3,"ȭ����");
		maplist.put(4,"������");
		maplist.put(5,"�����");
		maplist.put(6,"�ݿ���");
		maplist.put(7,"�����");
		
		System.out.println("��ũ�� "+maplist.size());
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
