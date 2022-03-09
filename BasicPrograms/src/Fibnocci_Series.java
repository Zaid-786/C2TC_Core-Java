
// write a program to fibnocci Series

public class Fibnocci_Series
{
	public static void main(String[] args)
		{
			int n1=0,n2=1,n3,count=5;
			
			System.out.print(n1+" "+n2);
			
			for(int i=2;i<count;i++)
			{
				n3=n1+n2;
				System.out.print(" "+n3);
				
				n1=n2;    				  //this is our main logic
				n2=n3;
			}	
			
			
		}
}
