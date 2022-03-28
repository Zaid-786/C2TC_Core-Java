package day_9;


//write a program to generate a integer random Number.
public class RandomNumberGenerator_2 
{
	public static void main(String[] args)
	{
		int max=100;
		int min=50;
		
				//Generate random int value from 200 to 400   
		System.out.println("Random value of type int between "+min+" to "+max+ ":");  
		int z = (int)(Math.random()*(max-min+1)+min);  
		System.out.println(z);  

	}

}
