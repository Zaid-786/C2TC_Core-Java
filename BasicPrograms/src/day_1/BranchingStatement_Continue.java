package day_1;

public class BranchingStatement_Continue {

	public static void main(String[] args) {
			
		int i;
		
		for(i=1;i<=5;i++)
		{
			if(i==3)
			{
				continue;
			}
			
			System.out.println("the values of i="+i);
				
		}
	}

}
