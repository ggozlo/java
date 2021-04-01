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
			System.out.print(name+"�� �Է��Ͻÿ� :");
			tempString = sc.next();
		}
		catch(Exception e)
		{
			System.out.println("�߸��� �Է��Դϴ�.");
			sc.next();
		}
		return tempString;
	}
	
	public int InputInt(Scanner sc,String name)
	{
		
		int tempint = 0;
		try
		{
			System.out.print(name+"�� �Է��Ͻÿ� :");
			tempint = sc.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("�߸��� �Է��Դϴ�");
			sc.next();
		}
		return tempint;
	}
}
