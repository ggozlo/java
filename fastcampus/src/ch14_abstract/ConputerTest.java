package ch14_abstract;

public class ConputerTest {

	public static void main(String[] args)
	{
		Computer desktop = new Desktop();
//		Computer computer = new Computer(); // 추상클래스는 인스턴스화 불가능
		desktop.turnOff();
	}

}
