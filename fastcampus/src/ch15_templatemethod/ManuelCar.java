package ch15_templatemethod;

public class ManuelCar extends Car
{

	@Override
	public void drive()
	{
		System.out.println("사람이 운전합니다.");
		System.out.println("사람이 운전대를 조작합니다");
	}

	@Override
	public void stop() 
	{
		System.out.println("브레이크를 밟아 정차합니다");
		
	}

	@Override
	public void wiper() {
		// TODO Auto-generated method stub
		
	}

}
