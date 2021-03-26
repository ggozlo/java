package test1;


public class Score implements Comparable<Score>
{
	String name;
	int age;
	public Score() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public Score(String name, int age ) 
	{
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Score o)
	{
//		if(this.age > o.age) 
//		{
//			return 1;
//		}
//		else if(this.age < o.age) return -1;
//		return this.age - o.age;
		return name.compareTo(o.name); //문자비교, 오름차순
		
	}
	
	@Override
	public String toString() {
		return "Score [name=" + name + ", age=" + age + "]";
	}
	
	


	


	
	
}
