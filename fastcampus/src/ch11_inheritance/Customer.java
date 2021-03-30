package ch11_inheritance;

public class Customer
{
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	
//	public Customer()
//	{
//		customerGrade = "SILVER";
//		bonusRatio = 0.01;
//		
//		System.out.println("Customer Call");
//	}
	
	
	
	public Customer(int customerID, String customerName) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
		
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}



	public int calcPrice(int price)
	{

		bonusPoint += price * bonusRatio;

		return price;
	}

	@Override
	public String toString() {
		return "Customer " + customerName + ", customerGrade="
				+ customerGrade + ", bonusPoint=" + bonusPoint ;
	}

	public int getCustomerID() {
		return customerID;
	}



	public String getCustomerName() {
		return customerName;
	}


	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}


	
	
}
