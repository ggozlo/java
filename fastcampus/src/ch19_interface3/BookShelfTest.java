package ch19_interface3;

public class BookShelfTest 
{

	public static void main(String[] args)
	{
		Queue bokkQueue = new BookShelf();
		bokkQueue.enQueue("토지1");
		bokkQueue.enQueue("토지2");
		bokkQueue.enQueue("토지3");
		bokkQueue.enQueue("토지4");
		bokkQueue.enQueue("토지5");

		
		System.out.println(bokkQueue.getSize());
		System.out.println(bokkQueue.deQueue());
		System.out.println(bokkQueue.deQueue());
		System.out.println(bokkQueue.deQueue());
		System.out.println(bokkQueue.deQueue());
		System.out.println(bokkQueue.deQueue());
		System.out.println(bokkQueue.getSize());
	}

}
