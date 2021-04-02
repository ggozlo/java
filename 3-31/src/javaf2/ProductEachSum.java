package javaf2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.stream.Collectors;

public class ProductEachSum
{
	public static void eachSum(ArrayList<Product> list) 
	{

		HashMap<String,Integer> map =  (HashMap<String, Integer>) list.stream().
				collect(Collectors.groupingBy(Product::getGoodsname,Collectors.summingInt(Product::getProfit)));
		for(String key: map.keySet())
		{
			System.out.println(key + "\t" + DF.df.format( map.get(key)));
		}
		System.out.println("=============================================");
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext())
		{
			String name = it.next();
			int sum = list.stream().filter(s->s.getGoodsname().equals(name)).mapToInt(Product :: getProfit).sum();
			System.out.println(name+"\t"+DF.df.format(sum));
		}
	}
}
