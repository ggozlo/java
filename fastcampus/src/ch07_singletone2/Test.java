package ch07_singletone2;

public class Test 
{
	

	public static void main(String[] args) 
	{
		CarFactory factory = CarFactory.getInstance();
		Car mySonata = factory.createCar();
		Car yourSonata = factory.createCar();
		
		System.out.println(mySonata.getCarNum());
		System.out.println(yourSonata.getCarNum());

	}

}
