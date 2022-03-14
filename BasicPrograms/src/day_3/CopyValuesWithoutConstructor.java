package day_3;


//in this program we copied parameterized constructor values into default constructor

public class CopyValuesWithoutConstructor
{
	  int id;                		//these are data fields
	  String name;
	  
		
	  CopyValuesWithoutConstructor(int id,String name)	//parameterized constructor 
	  {
		  this.id=id;
		  this.name=name;
		  
	  }
		
	  CopyValuesWithoutConstructor()      //unparameterized constructor 

	  {
		  
	  }
		
	  public void display()				// show the data fields values
		{
			System.out.println("id="+id+" name="+name);
		}
		
		public static void main(String[] args)
		{
			CopyValuesWithoutConstructor a=new CopyValuesWithoutConstructor(111,"zaid");      //parameterized constructor object a 
			CopyValuesWithoutConstructor b=new CopyValuesWithoutConstructor();					//default constructor object b
			
			b.id=a.id;             //asigning values object a into object b  id data member        
			b.name=a.name;         //asigning values object a into object b  name data member
			
			a.display();
			b.display();
		}

}
