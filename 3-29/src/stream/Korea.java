package stream;

public class Korea// implements Comparable<Korea>
{
	String name;
	int age;
	int score;
	public Korea(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}
	public Korea() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Korea [name=" + name + ", age=" + age + ", score=" + score + "]";
	}
	
//	@Override
//	public int compareTo(Korea o) {
//		
//		return age - o.age;
//	}
	
	
	
}
