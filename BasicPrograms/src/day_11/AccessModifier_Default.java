package day_11;


// example of Default access modifier 
/*the class is visible to all the classes that belong to the defaultPackage package. However,
 * if we try to use the our example class in another class outside of defaultPackage, 
 * we will get a compilation error.
*/



class AccessModifier_Default 
{
    void message()
    {
        System.out.println("This is a default method because of declaring time we dont use any access modifier then java provides by default access modifier is considered");
        System.out.println("declarations are visible only within the package (package priva)");
    }
    
}
