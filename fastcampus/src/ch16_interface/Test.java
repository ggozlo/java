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
