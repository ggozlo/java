package sample;

public class Launcher 
{

	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer("Asia");
		sb.append("Korea");
		sb.append("Seoul");
		sb.insert(4, "*");

		System.out.println(sb);
//		sb.replace(4, 5, " -");		
//		System.out.println(sb);
		sb.delete(0, 4);
		System.out.println(sb);
		
		StringBuilder stb = new StringBuilder(sb);
		System.out.println(stb);

	}

}
