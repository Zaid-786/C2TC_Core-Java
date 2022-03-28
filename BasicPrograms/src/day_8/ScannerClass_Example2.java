package day_8;

import java.util.Scanner;

public class ScannerClass_Example2
{

	public static void main(String[] args)
	{
	    		// creates a Scanner object
	    Scanner input = new Scanner(System.in);

	    System.out.println("Enter an integer: ");

	    		// reads an int value
	    int data = input.nextInt();

	    System.out.println("Using nextInt() for int value: " + data);

	    input.close();

	}

}
