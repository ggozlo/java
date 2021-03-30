package ch11_inheritance;

public class VIPCustomer extends Customer
{
	double saleRatio;
	private String agentID;
	
	public VIPCustomer(int customerID, String customerName)
	{
		super(customerID, customerName);
		bonusRatio = 0.05;
		saleRatio = 0.01;
		customerGrade = "VIP";
		
		System.out.println("VIPCustomer Call");
	}
	
	
	public String getAgentID()
	{
		return agentID;
	}
	
	
}
