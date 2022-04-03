package day_11;

//example of Public access modifier 

/*When methods, variables, classes, and so on are declared public, 
 * then we can access them from anywhere.*/

 class Animal1
{
    public int legCount;    // public variable


    public void display()    // public method

    {
        System.out.println("I am an animal.");
        System.out.println("I have " + legCount + " legs.");
    }
}




public class AccessModifier_Public 
{

	public static void main(String[] args) 
	{
       // accessing the public class
        	Animal1 animal = new Animal1();

       // accessing the public variable
        	animal.legCount = 4;
       // accessing the public method
        	animal.display();

	}

}
