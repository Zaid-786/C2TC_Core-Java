package day_5;

import java.util.Scanner;




// write a program to check a number is prime or NOT.
public class CheckPrimeNumber_NOT 
{

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a Number=");
		int num = sc.nextInt();

		int count = 0;

		for (int i = 1; i <= num; i++) 
		{
			if (num % i == 0)
			{
				count++;
			}
		}

		if (count == 2) {
			System.out.print("number is prime number..." + num);
		} else {
			System.out.print("number is not prime number..." + num);

		}

		sc.close();

		
	}

}
