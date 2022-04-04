package day_15;

import java.util.Scanner;

// write a program to check given number is positive and negrative.

public class CheckPositiveOrNegativeExample 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("Enter a number: ");  

		int num = sc.nextInt(); 
		
		//checks the number is greater than 0 or not  
		if(num>0)  
		{  
		System.out.println("The number is positive.");  
		}  
		
		//checks the number is less than 0 or not  
		else if(num<0)  
		{  
		System.out.println("The number is negative.");  
		}  
		
		//executes when the above two conditions return false  
		else  
		{  
		System.out.println("The number is zero.");  
		}  
	}

}
