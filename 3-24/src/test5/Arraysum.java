package test5;

import java.util.Scanner;

public class Arraysum
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�迭�� ũ�⸦ �����Ͻÿ�");
		int size = sc.nextInt();
		int [] arr = new int[size];
		int sum = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("������ �Է��Ͻÿ�");
			arr[i] = sc.nextInt(); 
			sum += arr[i];
		}
		
		sc.close();
		double avg = (double)sum / arr.length;
		System.out.println(avg);
		System.out.println(sum);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
		
	}	

	
}
