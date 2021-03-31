package ch12_polymorphism;

import java.util.ArrayList;

class Animal
{
	public void move()
	{
		System.out.println("동물이 움직입니다");
	}
}

class Human extends Animal
{

	@Override
	public void move() 
	{
		System.out.println("사람이 두발로 걷습니다.");
	}
	
	public void readBook()
	{
		System.out.println("책을 읽습니다");
	}
}

class Tiger extends Animal
{
	@Override
	public void move() 
	{
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	
	public void hunting() 
	{
		System.out.println("호랑이가 사냥을  합니다");
	}
}

class Eagle extends Animal
{
	@Override
	public void move() 
	{
		System.out.println("독수리가 하늘에서 비행합니다.");
	}
	
	public void flying() 
	{
		System.out.println("독수리가 날개를 펴고 날아오릅니다");
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
