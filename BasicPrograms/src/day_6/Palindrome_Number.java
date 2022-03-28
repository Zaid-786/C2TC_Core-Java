package day_6;

import java.util.*;

// write a program to Palindrome Number
public class Palindrome_Number
{
	public static void main(String[] args)
	{
		
		int r,sum=0,temp; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Number=");
		int num = sc.nextInt();
		temp=num;
		
		  while(num>0){    
			   r=num%10;  //getting remainder  
			   sum=(sum*10)+r;    
			   num=num/10;    
			  }    
			  if(temp==sum)    
			   System.out.println("palindrome number is ="+temp);    
			  else    
			   System.out.println("not palindrome is ="+temp);    

	
	}
}
