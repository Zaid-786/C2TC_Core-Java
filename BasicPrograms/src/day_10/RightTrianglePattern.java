package day_10;


// write a program to Right Triangle stars pattern
public class RightTrianglePattern 
{

	public static void main(String[] args) 
	{
		int i, j, row=6;   
							//outer loop for rows  
		for(i=1; i<=row; i++)   
		{   
							//inner loop for columns  
		for(j=1; j<=i; j++)   
		{   
							//prints stars   
		System.out.print("* ");   
		}   
								//throws the cursor in a new line after printing each line  
		System.out.println();   
		}   

	}

}
