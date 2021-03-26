package sample;

import java.util.*;

class Saram implements Comparable<Saram>
{
	String name;
	int age; 
	


	
	public Saram() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Saram(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	@Override
	public String toString() 
	{
		return "Saram [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Saram o) { // 비교함수 객체정렬
		
		return o.name.compareTo(name);
	}
	
	
}

public class sample5 {

	public static void main(String[] args) {
		Set<Saram> tt = new TreeSet<Saram>();
		tt.add(new Saram("내장산",741));
		tt.add(new Saram("한라산",456));
		tt.add(new Saram("북한산",852));
		tt.add(new Saram("명지산",423));
		tt.add(new Saram("화악산",123));
		tt.add(new Saram("관악산",789));
		tt.forEach(s -> System.out.println(s.getName()+"\t"+s.getAge()));
		System.out.println("============================================");
		
		tt.forEach(s -> System.out.println(s.getName()+"\t"+s.getAge()));
	}

}
