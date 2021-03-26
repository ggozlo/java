package sample;

import java.util.StringTokenizer;

public class Sample3
{
	public static void main(String[] args)
	{
		String aa = "가나다-라마바-사아자-이기자";
		StringTokenizer st = new StringTokenizer(aa, "-");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}
}
