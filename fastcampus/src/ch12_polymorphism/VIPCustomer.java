package ch12_polymorphism;

public class VIPCustomer extends Customer
{
	double saleRatio;
	private String agentID;
	
	public VIPCustomer(int customerID, String customerName)
	{
		super(customerID, customerName);
		bonusRatio = 0.05;
		saleRatio = 0.1;
		customerGrade = "VIP";
		
		System.out.println("VIPCustomer Call");
	}
	
	
	public String getAgentID()
	{
		return agentID;
	}


	@Override //에노테이션 컴파일러에게 오버라이딩 정보 전달
	public int calcPrice(int price) 
	{
		bonusPoint += price * bonusRatio;
		price -= price * saleRatio;
		return price;
	}
	
	
	
}
