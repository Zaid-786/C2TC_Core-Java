package day_15;

import java.util.Scanner;

// write a program to Display Even Number.

public class EvenNumberExample 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number..");
		int num=sc.nextInt();
		System.out.print("List of even numbers from 1 to "+num+": ");  

		
		for(int i=1;i<=num;i++)
		{
			if (i%2==0)   
			{  
			System.out.print(i + " ");  
			}  

		}

	}

}
