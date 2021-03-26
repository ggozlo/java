package ch04_classparameter;

public class Student 
{
	String name;
	int money;
	
	public Student(String name, int money)
	{
		this.name = name;
		this.money = money;
	}
	
	public void takeTaxi(Taxi taxi)
	{
		taxi.take(10000);
		this.money -= 10000; 
	}

	@Override
	public String toString() {
		return name +"님의 남은 돈은"+money+"원 입니다.";
	}
	
	
}
