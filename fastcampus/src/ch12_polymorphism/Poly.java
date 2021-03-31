package ch12_polymorphism;

import java.util.ArrayList;

class Animal
{
	public void move()
	{
		System.out.println("������ �����Դϴ�");
	}
}

class Human extends Animal
{

	@Override
	public void move() 
	{
		System.out.println("����� �ι߷� �Ƚ��ϴ�.");
	}
	
	public void readBook()
	{
		System.out.println("å�� �н��ϴ�");
	}
}

class Tiger extends Animal
{
	@Override
	public void move() 
	{
		System.out.println("ȣ���̰� �� �߷� �ݴϴ�.");
	}
	
	public void hunting() 
	{
		System.out.println("ȣ���̰� �����  �մϴ�");
	}
}

class Eagle extends Animal
{
	@Override
	public void move() 
	{
		System.out.println("�������� �ϴÿ��� �����մϴ�.");
	}
	
	public void flying() 
	{
		System.out.println("�������� ������ ��� ���ƿ����ϴ�");
	}
}


public class Poly
{

	public static void main(String[] args) 
	{
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();

		
//		Poly test = new Poly();
//		test.moveAnimal(hAnimal);
//		test.moveAnimal(tAnimal);
//		test.moveAnimal(eAnimal);
			
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(eAnimal);
		animalList.add(tAnimal);
		animalList.add(hAnimal);
		
		for(Animal a: animalList)
		{
			a.move();
		}
	}
	
	public void moveAnimal(Animal animal) 
	{
		animal.move();
	}
}
