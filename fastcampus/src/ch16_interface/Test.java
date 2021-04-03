package ch16_interface;

// 인터페이스 
// 모든 메서드가 추상메서드로 선언됨 (public abstract)
// 모든 변수는 상수로 선언됨(public static final)
// 멤버변수는 가질수 없음
public class Test
{

	public static void main(String[] args) 
	{
		int a = 10;
		int b = 2;
		Calc calc = new CompleteClalc(); // completecalc 는 calc 의 타입이기 떄문에 calc 를 호출해도 calc에 생성된 메소드는
										// 사용할수 있다 하지만 showInfo 메소드는 completecalc고유의 것이라 completecalc로 생성해야 한다.
		System.out.println(calc.add(a, b));
		System.out.println(calc.substract(a, b));
		System.out.println(calc.times(a, b));
		System.out.println(calc.divide(a, b));

	}

}
// 인터페이스 사용 이유 
// 클래스나 프로그램이 제공하는 기능을 명시적으로 선언 
// 일종의 클라이언트 코드와의 약속이며 클래스나 프로그램이 제공하는 명세
//클라이언트 프로그램은 인터페이스에 선언되 메서드 명세만 보고 이르 구현한 클래스를 사용할수 있음
// 어떤 객체가하나의 인터페이스 타입이라는 것은 그 인터페이스가 제공하는 모든 메서드를 구현했다는 의미임
// dao  = 데이터 접근 오브젝트