package stream;

public class Sample
{
	enum gender{MALE,FEMALE}
	enum city {SEOUL, BUSAN}
	
	gender gd;
	city ct;
	String name;
	int kor ;
	

	public Sample() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Sample(gender gd, city ct, String name, int kor) {
		super();
		this.gd = gd;
		this.ct = ct;
		this.name = name;
		this.kor = kor;
	}


	public gender getGd() {
		return gd;
	}


	public void setGd(gender gd) {
		this.gd = gd;
	}


	public city getCt() {
		return ct;
	}


	public void setCt(city ct) {
		this.ct = ct;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getKor() {
		return kor;
	}


	public void setKor(int kor) {
		this.kor = kor;
	}


	@Override
	public String toString() {
		return "[성별=" + gd + ", 도시=" + ct + ", name=" + name + ", kor=" + kor + "]";
	}

	
	
}
