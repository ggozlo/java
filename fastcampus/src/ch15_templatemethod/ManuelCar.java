package ch15_templatemethod;

public class ManuelCar extends Car
{

	@Override
	public void drive()
	{
		System.out.println("����� �����մϴ�.");
		System.out.println("����� �����븦 �����մϴ�");
	}

	@Override
	public void stop() 
	{
		System.out.println("�극��ũ�� ��� �����մϴ�");
		
	}

	@Override
	public void wiper() {
		// TODO Auto-generated method stub
		
	}

}
