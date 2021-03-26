package today;

//주민번호 입력하여 나이 를 구하는데..2021 을 년도를 자동계산방식으로
import java.util.*;

class AgeCal extends GregorianCalendar 
{
	String num;
	int year, age;

	public AgeCal(String num) 
	{
		super();
		this.num = num;
	}

	void year()
	{
		year = Integer.parseInt(num.substring(0,2)) + 1900;
	}
	
	void age()
	{
		age = get(YEAR) - year + 1 ;
	}

	public String getNum() {
		return num;
	}

	public int getYear() {
		return year;
	}

	public int getAge() {
		return age;
	}
	
	
}



// 주민번호 입력하여 나이 를 구하는데..2021 을 년도를 자동계산방식으로
public class Test 
{
	public static void main(String[] args)
	{
		String ResidentRegistrationNumber ;
		Scanner sc = new Scanner(System.in);
		AgeCal ac = new AgeCal(sc.next());
		ac.year();
		ac.age();

		
		
	}
}
