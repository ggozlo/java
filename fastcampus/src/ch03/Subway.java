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
		System.out.println(subwayNumber + "번의 승객 수는" + passengerCount + "명 이고" + profit + "만큼 벌었습니다");
	}

}
