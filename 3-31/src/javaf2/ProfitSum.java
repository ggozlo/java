package javaf2;

import java.util.ArrayList;

public class ProfitSum 
{
	static void profitsum(ArrayList<Product> list)
	{
		int totalProfit = list.stream().mapToInt(Product :: getProfit).sum();
		System.out.println("��ü ������ �� = "+DF.df.format(totalProfit));
	}
}
