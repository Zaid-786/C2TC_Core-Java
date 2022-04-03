package day_11;

//example of Protected access modifier 
/*When methods and data members are declared protected,
 * we can access them within the same package as well as from subclasses.
*/


class Animal
{
    protected void display()     // protected method

    {
        System.out.println("I am an animal");
    }
}



public class AccessModifier_Protected extends Animal
{
	public static void main(String[] args) 
	{
        // create an object of AccessModifier_Protected class
		AccessModifier_Protected  obj= new AccessModifier_Protected();
		
		
		obj.display();         // access protected method

		
	}

}
