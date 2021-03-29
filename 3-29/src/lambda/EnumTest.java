package lambda;
//열거형 자료는 정확한 값을 입력받기를 원한느 경우
// 성별입력
public class EnumTest
{
	enum gender {MAN,WOMAN}
	static String MAN = "남자";
	static String WOMAN ="여자";
	
	enum week {MONDAY, TUSEDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}
	String MONDAY = "월요일";
	String TUSEDAY = "화요일";
	String WEDNESDAY = "수요일";
	String THURSDAY = "목요일";
	String FRIDAY = "금요일";
	String SATURDAY = "토요일";
	String SUNDAY = "일요일";
	
	public static void main(String[] args)
	{	
//		gender gd; // 성별을 기억하는 변수
//		gd = gender.WOMAN;
//		System.out.println(gd);
		
//		String ab;
//		ab= EnumTest.MAN;
//		System.out.println(ab);
//		System.out.println(gender.valueOf("SAL"));
//		System.out.println(gender.MAN); 
		
		System.out.println(getMAN());
	}

	public static String getMAN() {
		return MAN;
	}

	public static String getWOMAN() {
		return WOMAN;
	}
	

}
