package ch04_classparameter;

public class Taxi 
{
	String companyName;
	int fee = 10000;
	int profit = 0;
	
	public Taxi(String companyName)
	{
		this.companyName = companyName;
	}
	
	void take(int money)
	{
		this.profit += money;
	}

	@Override
	public String toString() {
		return "Taxi [companyName=" + companyName + ", profit=" + profit + "]";
	}
	
	
}
