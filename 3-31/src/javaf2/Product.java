package javaf2;
// 1파일 입력
// 2상품명별 합계
// 3 상품명, 매출액 내림정렬
// 4 상품명별 합계
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
			System.out.println("0:파일입력, 1:입력, 2:출력, 3:검색, 4:자료 수정, 5:삭제, 6:정렬출력, 7.수익 총합, 8.상품별수익합, 9.선택상품수익합");
			int select=di.InputInt(sc, "원하는 기능");
			System.out.println("---------------------------------------------");

			switch (select) 
			{
			case 0:
				ProductFileInput.fileInput(list);
				break;
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
				break;
			case 8: 
				ProductEachSum.eachSum(list);
				break;
			case 9: 
				ProductSearchSum.searchsum(list, sc);
				break;
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
