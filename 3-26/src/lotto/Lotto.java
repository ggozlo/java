package lotto;

import java.util.HashSet;
import java.util.Random;


public class Lotto 
{
	HashSet<Integer> ti = new HashSet<Integer>();
	int bonus;
	
	public Lotto()
	{
		ti.clear();
		Random rand = new Random();
		while(ti.size()<6)
		{
			ti.add(rand.nextInt(45)+1);
		}
		
		while(true)
		{
			bonus = rand.nextInt(45)+1;
			boolean bool = ti.contains(bonus);
			
			if(bool == true)
			{
				continue;
			}
			else
			{
				break;
			}
		}
		

	}
	

	
	public HashSet<Integer> getTi() 
	{
		return ti;
	}



	void ptr()
	{
		System.out.print(ti);
		System.out.println(" 보너스 번호:"+bonus);

	}
}
