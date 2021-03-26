package test3;

import java.util.Scanner;

public class Cal
{
	private static int sum =0; 
	private static double avg=0; 
	private final static int stop = -1;
	private static int cnt = 0;
	
	public static void loop()
	{
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.print("수를 입력하시오 : ");
			int num = sc.nextInt();
			
			if(num == stop)
			{
				break;
			}
			
			Cal.process(num);
			

		}
		
		Cal.process2(sum, cnt);
		Cal.ptrRst();
		sc.close();
	}
	
	
	private static void  process(int num)
	{
		sum += num;
		cnt++;
	}
	private static void process2(int sum, int cnt)
	{
		avg = (double)sum / cnt;
	}
	private static void ptrRst()
	{
		System.out.println("합:"+sum+" 입력된 개수"+cnt+" 평균:"+avg);
		sum = 0;
		avg = 0; 
		cnt = 0;
	}
	
	
}
