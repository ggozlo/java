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
		DataImport di = DataImport.getInstance();
		
		while(true)
		{
			System.out.println("1:입력, 2:출력, 3:검색, 4:자료 수정, 5:삭제, 6:정렬출력, 7.수익 총합");
			int select=di.InputInt(sc, "원하는 기능");
			System.out.println("---------------------------------------------");

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
				ProductRemove.remove(list, sc);
				break;
			case 6:
			    ProductCompare.compareProduct(list, sc);
			    break;
			case 7: 
				ProfitSum.profitsum(list);
			default:
				break;
			}
			System.out.println("=============================================================");
		}
	}

	
	
	public Product(String goodsname, int quantity, int price,int profit) 
	{
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
