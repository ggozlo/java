package ch04_classparameter;

public class Launcher {

	public static void main(String[] args)
	{
		Student st = new Student("Edward", 20000);
		Taxi tx = new Taxi("�߳����� ���");
		
		st.takeTaxi(tx);
		
		System.out.println(st.toString());
		System.out.println(tx.toString());

	}

}
