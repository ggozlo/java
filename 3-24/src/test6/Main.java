package test6;

public class Main {

	public static void main(String[] args)
	{
		Person pr  = new Person(55, 23, 171, "¾çÇÑ¹ü");
		Student st = new Student(pr);

		System.out.println(st.toString());
		
	}

}
