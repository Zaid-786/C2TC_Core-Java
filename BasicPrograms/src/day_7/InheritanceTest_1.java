package day_7;


//To write a program single level inheritance

class Animals  						//this is parent or super class     							
{
	void eat()						//this is a method
	{
		System.out.println("this is eating...");
	}
}

class Dog extends Animals					//this is child or sub class extend by parent or superclass
{
	void bark()									//this is a method 
	{
		System.out.println("this is barking...");
	}
}



public class InheritanceTest_1 
{
	public static void main(String[] args) 
	{
		Dog a=new Dog();
		a.bark();
		a.eat();
	}

}
