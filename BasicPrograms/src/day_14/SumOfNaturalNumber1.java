package day_14;

import java.util.Scanner;

// write a program of Sum of Natural Number.
public class SumOfNaturalNumber1 
{
	public static void main(String[] args) 
	{
		int i, sum = 0,num; 
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number..");
		 num=sc.nextInt();
		 
		 
		//executes until the condition returns true  
		for(i = 1; i <= num; ++i)  
		{  
		//adding the value of i into sum variable  
		sum = sum + i;  
		}  
		//prints the sum   
		System.out.println("Sum of First 10 Natural Numbers is = " + sum);  

	}

}
