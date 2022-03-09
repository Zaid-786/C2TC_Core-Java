package day_1;

public class BranchingStatement_Break {

	public static void main(String[] args) {

		int i=1;
		
		while(i<=5)
		{
			System.out.println("the value of i="+i);
			i++;
			
			if(i==3)				//this branching statement break condition
			  break;
			
		}
		
		System.out.println("out of loops...");
		
		
		
	}

}
