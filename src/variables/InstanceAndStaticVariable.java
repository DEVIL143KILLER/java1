package variables;
import java.util.Scanner;

class StaticVariable
{
	static int rollno;
	static String rname="ram";
	static void msg()
	{
		System.out.println("This is static msg");
	}
	
	String name;		//instance variable
	void msg1()		
	{
		System.out.println("This is instance variable msg");
	}
}

public class InstanceAndStaticVariable 
{
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		StaticVariable.msg();
		StaticVariable.rollno=21;								//static variable
		System.out.println("Rollno :"+StaticVariable.rollno);
		System.out.println("rname :"+StaticVariable.rname);
		
		StaticVariable s=new StaticVariable();		//instance variable
		s.msg1();
		s.name=s1.next();
		System.out.println(s.name);
		
	}

}
