package test6;

public class Person 
{
	private int weight;
	int age;
	int height;
	String name;
	
	
	public Person(int weight, int age, int height, String name)
	{

		this.weight = weight;
		this.age = age;
		this.height = height;
		this.name = name;
	}


	public int getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}


	public int getAge() {
		return age;
	}


	public int getHeight() {
		return height;
	}


	public String getName() {
		return name;
	}
	
	
	
}
