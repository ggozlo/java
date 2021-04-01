package javaf2;

import java.util.Scanner;

public class DataImport
{
	private DataImport() {}
	private static DataImport di = null;
	
	public static DataImport getInstance()
	{
		if(di == null)
		{
			di = new DataImport();
		}
		return di;
	}
	
	public String InputString(Scanner sc,String name)
	{
		String tempString = null;
		try
		{
			System.out.print(name+"을 입력하시오 :");
			tempString = sc.next();
		}
		catch(Exception e)
		{
			System.out.println("잘못된 입력입니다.");
			sc.next();
		}
		return tempString;
	}
	
	public int InputInt(Scanner sc,String name)
	{
		
		int tempint = 0;
		try
		{
			System.out.print(name+"을 입력하시오 :");
			tempint = sc.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("잘못된 입력입니다");
			sc.next();
		}
		return tempint;
	}
}
