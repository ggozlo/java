package sample;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Math_Test {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("\u00a4 #,##0��");
		SimpleDateFormat sd = new SimpleDateFormat("YYYY�� MM�� dd�� a hh�� mm�� ss��");
		int a=5;
		Date da = new Date();
		System.out.println(sd.format(da));
	}

}
