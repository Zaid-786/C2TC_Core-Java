package day_8;

import java.util.Scanner;

//Example 1: Read a Line of Text Using Scanner
public class ScannerClass_Example1
{
	public static void main(String[] args)
	{
					// creates an object of Scanner
	    Scanner input = new Scanner(System.in);

	    System.out.print("Enter your name: ");

	    			// takes input from the keyboard
	    String name = input.nextLine();

	    			// prints the name
	    System.out.println("My name is " + name);

	    			// closes the scanner
	    input.close();

	}

}
