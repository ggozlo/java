package ch19_interface3;

public class BookShelfTest 
{

	public static void main(String[] args)
	{
		Queue bokkQueue = new BookShelf();
		bokkQueue.enQueue("����1");
		bokkQueue.enQueue("����2");
		bokkQueue.enQueue("����3");
		bokkQueue.enQueue("����4");
		bokkQueue.enQueue("����5");

		
		System.out.println(bokkQueue.getSize());
		System.out.println(bokkQueue.deQueue());
		System.out.println(bokkQueue.deQueue());
		System.out.println(bokkQueue.deQueue());
		System.out.println(bokkQueue.deQueue());
		System.out.println(bokkQueue.deQueue());
		System.out.println(bokkQueue.getSize());
	}

}
