package ch15_templatemethod;

public abstract class Car
{
	public abstract void drive() ;
	public abstract void stop();
	public abstract void wiper();
	
	public void startCar()
	{
		System.out.println("�õ��� �մϴ�");
	}
	
	public void turnOff() 
	{
		System.out.println("�õ��� ���ϴ�.");
	}
	
	public void washCar() {}; // �����ΰ� ������ ������� ���� �޼��� / �ʿ��ҋ� ������
	
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
