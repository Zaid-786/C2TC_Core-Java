package day_4;

// in this program we used static variable counter and perform counter ++ in default constructor.
public class CounterWithStatic
{
	 	static int counter=0;      	//static instance variable counter=0
	    
	    CounterWithStatic()			// default constructor 
	    {
	    	counter++;						//incrementing counter=counter+1;
	    	System.out.println(counter);
	    }
	    
		public static void main(String[] args)
		{
			
			CounterWithStatic a=new CounterWithStatic();		// we created objects of class CounterWithStatic
			CounterWithStatic b=new CounterWithStatic();
			CounterWithStatic c=new CounterWithStatic();
			
		}

}
