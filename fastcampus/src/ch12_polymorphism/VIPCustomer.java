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


	@Override //�������̼� �����Ϸ����� �������̵� ���� ����
	public int calcPrice(int price) 
	{
		bonusPoint += price * bonusRatio;
		price -= price * saleRatio;
		return price;
	}
	
	
	
}
