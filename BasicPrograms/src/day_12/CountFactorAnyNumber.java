package day_12;

import java.util.Scanner;

//Write a Program to Count Factor Digit of Any Number?
public class CountFactorAnyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a Number=");
		int num = sc.nextInt();
			
		int count=0;
		
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		
		System.out.print("count factor given number= "+count);
		
		sc.close();

	}

}
