package day_17;



interface Drawable{ 
	
void draw();  

}  

class Rectangle implements Drawable{
	
public void draw()
{
	System.out.println("drawing rectangle");
}  
}  


class Circle implements Drawable{ 
	
public void draw()
{
	System.out.println("drawing circle");
	}  
}  




public class InterfaceExample_2 
{
	public static void main(String[] args) 
	{
		Drawable d=new Rectangle();
		d.draw();  
		
		Drawable d1=new Circle();
		d1.draw();  

	}

}
