package test5;

public class Arraytest
{

	public static void main(String[] args) 
	{
		int [][] aa = {{1,2,3},{3,4},{5,6},{7,8}};
		int cnt=0;
		int sum =0;
		for(int i=0;i<aa.length;i++)
		{
			for(int j=0;j<aa[i].length;j++)
			{
				sum += aa[i][j];
				cnt++;
			}
		}
		
		double avg = (double)sum / cnt;

		
		System.out.println(avg);
		System.out.println(sum);

	}

}
