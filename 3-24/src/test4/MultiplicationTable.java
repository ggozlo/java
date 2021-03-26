package test4;

public class MultiplicationTable
{
	public static void main(String[] args)
	{
		int str = 2;
		int end = 4;
		
		while(end <= 10)
		{
			for(int i=1;i<=9;i++)
			{
				
				for(int j=str;j<=end;j++)
				{
					if(j==10) break;
					System.out.print(j + " * " + i + " = " + i*j + "\t| ");
				}
				System.out.println();
			}
			
			System.out.println("");

			str += 3;
			end += 3;
		}
	}
}
