package sample;

import java.util.StringTokenizer;

public class Sample3
{
	public static void main(String[] args)
	{
		String aa = "������-�󸶹�-�����-�̱���";
		StringTokenizer st = new StringTokenizer(aa, "-");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}
}
