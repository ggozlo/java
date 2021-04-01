package ch15_templatemethod;

public abstract class Car
{
	public abstract void drive() ;
	public abstract void stop();
	public abstract void wiper();
	
	public void startCar()
	{
		System.out.println("시동을 켭니다");
	}
	
	public void turnOff() 
	{
		System.out.println("시동을 끕니다.");
	}
	
	public void washCar() {}; // 구현부가 있으나 설명되지 않은 메서드 / 필요할떄 재정의
	
	final public void run() 
	{
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
		washCar();
	}
}
