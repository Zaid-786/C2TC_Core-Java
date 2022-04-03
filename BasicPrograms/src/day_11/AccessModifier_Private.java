package day_11;

//example of Default access modifier 
/*When variables and methods are declared private,
 * they cannot be accessed outside of the class. */


class Data 
{
    private String name;				// private variable

}


public class AccessModifier_Private 
{
	public static void main(String[] args) 
	{
        Data d = new Data();        // create an object of Data

        d.name = "Programiz";        // access private variable and field from another class


	}

}
