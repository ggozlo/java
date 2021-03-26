package test6;

public class Student extends Person
{
	
	
	public Student(Person person) 
	{
		super(person.getWeight(), person.age, person.height, person.name);
		
	}

	public Student(int weight, int age, int height, String name) 
	{
		super(weight, age, height, name);

	}

	@Override
	public String toString() 
	{
		return "Student [age=" + age + ", height=" + height + ", name=" + name + ", Weight=" + getWeight() + "]";
	}
	
	

}
