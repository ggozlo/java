package javaf2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Product
{
	String goodsname;
	int quantity;
	int price;
	int profit;
	
	public static void run()
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Product> list = new ArrayList<Product>();	
		
		while(true)
		{
			System.out.println("1:�Է�, 2:���, 3:�˻�, 4:�ڷ� ����, 5:��ǰ�� ���, 6:�����������");
			System.out.print("���ϴ� ����� �����Ͻÿ� :");
			int select=0;
			
			try
			{
				select = sc.nextInt();
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());

				sc.nextLine();
			}
			
			
			switch (select) 
			{
			case 1:
				ProductInput.input(list, sc);
				break;
			case 2:	
				ProductOutPut.productShowInfo(list);
				break;
			case 3:
				ProductSearch.searchProduct(list, sc);
				break;
			case 4:
				ProductReform.reformProduct(list, sc);
				break;
			case 5:
				break;
			case 6:
			    ProductCompare.compareProduct(list, sc);
			    break;
			default:
				break;
			}
		}
	}

	
	
	
	
	
	
	
	
	
	
	public Product(String goodsname, int quantity, int price,int profit) {
		super();
		this.goodsname = goodsname;
		this.quantity = quantity;
		this.price = price;
		this.profit = profit;
	}











	public String getGoodsname() {
		return goodsname;
	}

	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getProfit() {
		return profit;
	}

	public void setProfit(int profit) {
		this.profit = profit;
	}
	
	
}
