package lotto;

import java.util.ArrayList;

public class Creater extends Lotto
{
	ArrayList<Lotto> al = new ArrayList<Lotto>();
	
	public Creater(int money)
	{
		int price = 5000;
		if(money / price >= 1)
		{
			for(int i=0;i<money/price;i++)
			{
				al.add(new Lotto());
			}
		}
		else
		{
			System.out.println("�ݾ��� �����մϴ�.");
		}
	}

	public ArrayList<Lotto> getAl() 
	{
		return al;
	}
	
	

}
