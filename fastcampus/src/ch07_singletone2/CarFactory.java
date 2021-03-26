package ch07_singletone2;

public class CarFactory
{
	private static CarFactory instance = new CarFactory();
	static int carNumber = 100000;
	
	private CarFactory()
	{
		
	}
	
	public static CarFactory getInstance() 
	{
		return instance;
	}
	
	public Car createCar()
	{
		Car car = new Car(carNumber);
		carNumber++;
		return car;
	}
	
	
}
