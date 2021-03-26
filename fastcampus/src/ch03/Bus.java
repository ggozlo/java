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
		System.out.println(busNumber + "���� �°� ����" + passengerCount + "�� �̰�" + profit + "��ŭ �������ϴ�");
	}

}
