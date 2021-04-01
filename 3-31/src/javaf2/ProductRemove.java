package javaf2;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductRemove 
{
	static void remove(ArrayList<Product> list, Scanner sc)
	{
		if(list.size() != 0)
		{
			int i=0;
			System.out.println("0\t전체삭제");
			for(Product s : list)
			{
				System.out.println(++i +"\t상품명 :"+s.getGoodsname() + " 수량 : "+s.getQuantity()+" 가격 : "+ s.getPrice()+" 이익 :"+DF.df.format(s.getProfit()));
			}
			System.out.print("삭제하려는 학생의번호를 입력하시오 :");
			int select = sc.nextInt();
			if(select > i) System.out.println("없는 번호입니다!");
			else if(select == 0)
			{
				System.out.print("정말로 전체 삭제 하겠습니까?");
				String order = sc.next();
				if (order.equals("Y"))
				{
					list.clear();
				}
				else
				{
					System.out.println("삭제했습니다>");
				}
			}
			else 
			{
				System.out.println("\t상품명 :"+list.get(select-1).goodsname + " 수량 : "+list.get(select-1).getQuantity()+
						" 가격 : "+ list.get(select-1).getPrice()+" 이익 :"+DF.df.format(list.get(select-1).getProfit()));
				System.out.print("정말로 삭제 하시겠습니까?(Y/N)");
				String order = sc.next();
				if (order.equals("Y"))
				{
					list.remove(select -1);
				}
				else
				{
					System.out.println("삭제했습니다>");
				}
			}
		}
		else System.out.println("저장된 자료가 없습니다!");
	}
}


