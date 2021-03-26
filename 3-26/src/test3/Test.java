package test3;

import java.util.TreeSet;

public class Test
{

	public static void main(String[] args) 
	{
		TreeSet<Company> cp = new TreeSet<Company>();
		cp.add(new Company("휴지", 6,500));
		cp.add(new Company("가방", 20,1500));
		cp.add(new Company("햄버거", 8,8500));
		cp.add(new Company("라면", 100,700));
		cp.add(new Company("이어폰", 50,1000));
		
		for(Company cc : cp)
		{
			System.out.print(cc.getGoods()+" ");
			System.out.print(cc.getQuentity()+" ");
			System.out.print(cc.getPrice()+" ");
			System.out.println(cc.getQuentity() * cc.getPrice());
		}
		
	
		
	}

}
