package ch13_Upcasting;

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
		
		Poly pl = new Poly();
		pl.TestDownCasint(animalList);
	
	}
	
	public void TestDownCasint(ArrayList<Animal> list)
	{
		for(int i=0;i<list.size();i++)
		{
			Animal animal = list.get(i);
			if(animal instanceof Human)
			{
				Human human = (Human) list.get(i);
				human.readBook();
			}
			else if(animal instanceof Tiger)
			{
				Tiger tiger = (Tiger) list.get(i);
				tiger.hunting();
			}
			else if(animal instanceof Eagle)
			{
				Eagle eagle = (Eagle) list.get(i);
				eagle.flying();
			}
			else {
				System.out.println("unknown");
			}
		}
	}
	
	public void moveAnimal(Animal animal) 
	{
		animal.move();
	}
}
