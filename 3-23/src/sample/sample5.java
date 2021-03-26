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
	public int compareTo(Saram o) { // ���Լ� ��ü����
		
		return o.name.compareTo(name);
	}
	
	
}

public class sample5 {

	public static void main(String[] args) {
		Set<Saram> tt = new TreeSet<Saram>();
		tt.add(new Saram("�����",741));
		tt.add(new Saram("�Ѷ��",456));
		tt.add(new Saram("���ѻ�",852));
		tt.add(new Saram("������",423));
		tt.add(new Saram("ȭ�ǻ�",123));
		tt.add(new Saram("���ǻ�",789));
		tt.forEach(s -> System.out.println(s.getName()+"\t"+s.getAge()));
		System.out.println("============================================");
		
		tt.forEach(s -> System.out.println(s.getName()+"\t"+s.getAge()));
	}

}
