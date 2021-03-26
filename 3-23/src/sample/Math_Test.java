package sample;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Math_Test {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("\u00a4 #,##0원");
		SimpleDateFormat sd = new SimpleDateFormat("YYYY년 MM월 dd일 a hh시 mm분 ss초");
		int a=5;
		Date da = new Date();
		System.out.println(sd.format(da));
	}

}
