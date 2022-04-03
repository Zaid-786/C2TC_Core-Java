package day_11;



abstract class Animal_2
{
	  abstract void makeSound();

	  public void eat() 
	  {
	    System.out.println("I can eat.");
	  }
	}

	class Dog extends Animal_2 {

		// provide implementation of abstract method
	  public void makeSound() 
	  {
	    System.out.println("Bark bark");
	  }
	}




public class AbstractExample_2 
{

	public static void main(String[] args) 
	{
		// create an object of Dog class
	    	Dog d1 = new Dog();

	    d1.makeSound();
	    d1.eat();
	}

}
