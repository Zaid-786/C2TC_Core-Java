package day_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// write a program to Armstrong Number by using BuffredReader class
public class ArmstrongNumber_Example
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number");
		int num = Integer.parseInt(br.readLine());
		int number, digit, sum = 0;
		number = num;
		
		while (number != 0)
		{
		digit = number % 10;
		sum = sum + digit*digit*digit;
		number /= 10;
		}
		
		if(sum == num)
		System.out.println(num + " is an Armstrong number");
		else
		System.out.println(num + " is not an Armstrong number");

	}

}
