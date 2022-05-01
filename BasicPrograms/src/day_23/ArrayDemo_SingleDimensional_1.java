package day_23;


// Declaration & Initialization of Single dimensional Array

/* Declaration of single Dimensional:-
  
 1* syntax:-     data-type[]  array_name;
    Example:-      int[]  a;
  
 2* syntax:-     data-type  []array_name;
    Example:-      int  []a;
 
 3* syntax:-     data-type  array_name[];
    Example:-      int  a[];
  
 */




public class ArrayDemo_SingleDimensional_1 
{

	public static void main(String[] args) 
	{
		int[] a=new int[3];					// declaration of single dimensional
		
		a[0]=11;							// initialization of single dimensional
		a[1]=22;
		a[2]=33;
		
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		
	}

}
