package day_2;


// Cube Method With Static means we dont need instance for it.
public class CubeMethodWithStatic 
{
		public static int cube(int x)
		{
			return x*x*x;
		}
	
		public static void main(String[] args)
		{
			/*Scanner scan=new Scanner(System.in);
		    
			System.out.println("enter a number=");
			int num=scan.nextInt(); */
			
			
			
			int result=cube(3);
			System.out.println("cube of given number= " +result);
		}

}
