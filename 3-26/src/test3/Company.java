package test3;

public class Company implements Comparable<Company> {
	String goods;
	int quentity;
	int price;
	int profit;

	public Company(String goods, int quentity, int price) {
		super();
		this.goods = goods;
		this.quentity = quentity;
		this.price = price;
		
	}

	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getGoods() {
		return goods;
	}

	public void setGoods(String goods) {
		this.goods = goods;
	}

	public int getQuentity() {
		return quentity;
	}

	public void setQuentity(int quentity) {
		this.quentity = quentity;
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

	@Override
	public int compareTo(Company o) {
	
		return this.goods.compareTo(o.getGoods());
	}

}
