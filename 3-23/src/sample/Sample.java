package sample;

import java.util.*;
public class Sample 
{
	public static void main(String[] args)
	{
		String [] name = {"���ǻ�","������","�Ѷ��","��ȯ��","�ݰ���","ȭ�ǻ�","�빮��","�ݿ���"};

		
		for(String k: name)
		{
			System.out.println(k);
		}
		
		System.out.println("=======================");
		// ����
		Arrays.sort(name, Collections.reverseOrder());
		
		for(String k: name)
		{
			System.out.println(k);
		}
	}
}
