package day_2;

//Write a Program to Count of Digit Number Except of Zero?

public class CountDigitNumberExceptOfZero {

	public static void main(String[] args) 
	{
		int num = 1230000, count = 0;

		while (num > 0)
		{
			if (num % 10 != 0)
			    {
			    	count++;
			    }

			num = num / 10;
		}
				System.out.println("Count Digit Number Except of Zero =" +count);
	}

}
