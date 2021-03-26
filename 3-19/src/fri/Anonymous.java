package fri;

abstract class Aa
{
	abstract void aa();
}
public class Anonymous {
	
	public static void main(String[] args)
	{
		Aa aa = new Aa() {

			@Override
			void aa() {
				System.out.println("익명클래스");
				
			}
			
		};
		
		aa.aa();
	}
}
