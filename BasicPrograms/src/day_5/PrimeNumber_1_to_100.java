package day_5;


// Write a program to Prime Number 1 to 100 ?

public class PrimeNumber_1_to_100 {

	public static void main(String[] args) 
	{
		int count = 0;

		System.out.println("prime number 1 to 100 ");

		for (int i = 1; i <= 100; i++)
		{
			count = 0;
			for (int j = 1; j <= i; j++) 
			{
				if (i % j == 0) 
				{
					count++;
				}
			}
			
			if (count == 2) 
			{
				System.out.print(i+" ");
			}
		}

	}

}
