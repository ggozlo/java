package ch15_templatemethod;

public class CarTest {

	public static void main(String[] args)
	{
		Car aicar = new AICar();
		aicar.run();
		System.out.println("===================================");
		Car mCar = new ManuelCar();
		mCar.run();
	}

}
