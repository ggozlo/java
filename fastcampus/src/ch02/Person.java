package ch02;

public class Person
{
	String name;
	int age;
	
	public Person()
	{
		this("�̸�����", 0);
	}

	public Person(String name, int age) 
	{
		this.name = name;
		this.age = age;
	}
	
	public void showPerson()
	{
		System.out.println(name+" "+age);
	}
	
	public Person getPerson()
	{
		return this;
	}
	public static void main(String[] args)
	{
		Person person = new Person();
		person.showPerson();
		System.out.println(person);
	}
	
}
