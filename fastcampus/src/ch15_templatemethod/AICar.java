package ch15_templatemethod;

public class AICar extends Car 
{

	@Override
	public void drive() 
	{
		System.out.println("자율 주행을 합니다.");
		System.out.println("자동차가 스스로 주행을 합니다");
		
	}

	@Override
	public void stop() 
	{
		System.out.println("장애물 앞에서 정차했습니다.");
		
	}

	@Override
	public void wiper() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void washCar()
	{
		System.out.println("자동세차를 합니다");
	}
	
}
