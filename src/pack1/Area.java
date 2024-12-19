package pack1;

class Land
{
	public void Square() 
	{
	System.out.println("this land is square shape");	
	}
	public void circle()
	{
	System.out.println("this land is circle shape");	
	}
		
}
public class Area extends Land
{	static int rect;	//static variable
	public double radius=33.4;	//instance variable
	System.out.println(radius);
	public Area(double radius)		//constructor
	{
		this.radius=radius;
		
	}
	public double circleArea()
	{
		return 3.14*radius*radius;
	}
	public static void main(String[] args)
	{
		Area.rect=24;		//static variable
		
		Area a1=new Area(3.5);	//put value to constructor radius
		System.out.println("constructor :"+a1.circleArea());
		a1.circle();	//calling parent class 
	}
}
