package conditionsAndArray;

public class MethodOverloading 
{
	void add(int a)
	{
		  System.out.println("Addition with 1 parameter: "+(++a));
	}
	void add(int a, int b) 
	{
		  System.out.println("Addition with 2 parameters : "+(a+b));
	}
	void add (int a, int b, int c) 
	{
		 System.out.println("Addition with 3 parameter: "+(a+b+c));
	}
	void add(float a,int b) 
	{
		 System.out.println("Addition with 2(float+int) parameter: "+(a+b));
	}
	void add(int a,float b) 
	{
		 System.out.println("Addition with 2(int+float) parameter: "+(a+b));
	}
public static void main(String []args)
{
		    MethodOverloading m=new MethodOverloading();
		    m.add(7);
		    m.add(21,22);
		    m.add(7,77,777);
		    m.add(21.3f,34);
		    m.add(77,77.43f);
		   }
		   
		 
}
