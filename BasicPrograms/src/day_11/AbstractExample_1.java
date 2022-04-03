package day_11;


// Example of Abstraction


abstract class Language 
{
	  public void display() 	  // method of abstract class
	  {
	    System.out.println("This is Java Programming");
	  }
	}

public class AbstractExample_1 extends Language{

	public static void main(String[] args)
	{
	    // create an object of Main
			AbstractExample_1 obj = new AbstractExample_1();

	    // access method of abstract class
	    // using object of Main class
			obj.display();

	}

}
