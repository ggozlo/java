package ch03;

public class Subway
{
	int subwayNumber;
	int passengerCount;
	int profit;
	
	public Subway(int subwayNumber)
	{
		this.subwayNumber = subwayNumber;
	}
	
	public void take(int fee)
	{
		this.profit += fee;
		passengerCount++;
	}
	
	public void showSubwayInfo() 
	{
		System.out.println(subwayNumber + "���� �°� ����" + passengerCount + "�� �̰�" + profit + "��ŭ �������ϴ�");
	}

}
