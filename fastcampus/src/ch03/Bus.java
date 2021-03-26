package ch03;

public class Bus
{
	int busNumber;
	int passengerCount;
	int profit;
	
	public Bus(int busNumber)
	{
		this.busNumber = busNumber;
	}
	
	public void take(int fee)
	{
		this.profit += fee;
		passengerCount++;
	}
	
	public void showBusInfo() 
	{
		System.out.println(busNumber + "번의 승객 수는" + passengerCount + "명 이고" + profit + "만큼 벌었습니다");
	}

}
