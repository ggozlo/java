package test;

public class Person
{
	String name;
	int age;
	boolean marriged;
	int child;
	
	public Person(String name, int age, boolean marriged, int child) 
	{
		this.name = name;
		this.age = age;
		this.marriged = marriged;
		this.child = child;
	}

	@Override
	public String toString() 
	{
		return "Person [�̸�=" + name + ", ����=" + age + ", ��ȥ����=" + marriged + ", �ڳ��=" + child + "]";
	}
	
	
	
	
}
