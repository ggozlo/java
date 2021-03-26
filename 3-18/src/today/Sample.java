package today;


import java.util.*;




public class Sample extends GregorianCalendar 
{

	public static void main(String[] args)
	{
		GregorianCalendar gg = new GregorianCalendar();
		String apm;
		String [] date = {"일","월","화","수","목","금","토"};
		int year = gg.get(YEAR);
		int month = gg.get(MONTH) +1;
		int day = gg.get(DATE);
		int h  = gg.get(HOUR);
		int m = gg.get(MINUTE);
		int s = gg.get(SECOND);
		int weeks = gg.get(DAY_OF_WEEK);
		int ap = gg.get(AM);
		
		if (ap==0)
			apm = "오전";
		else 
			apm = "오후";
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(apm+" "+h+":"+m+":"+s);
		System.out.println(date[weeks-1]);
	}
}
