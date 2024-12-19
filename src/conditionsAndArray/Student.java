package conditionsAndArray;

public class Student 
{
	int rollno=21;
	String name="Ram";
	Student()
	{
		System.out.println("Default constructor");
		System.out.println("Roll NO:"+rollno);
		System.out.println("Name :"+name);
	}
	
	Student(int roll,String nm)
	{
		System.out.println("Parametarized constructor");
		this.rollno=roll;
		name=nm;
		System.out.println("Roll NO:"+this.rollno);
		System.out.println("Roll NO:"+this.name);
	}
	
	public Student(Student s)
	{
		System.out.println("Copy Constructor");
		rollno=s.rollno;
		name=s.name;
		System.out.println("Roll NO:"+rollno);
		System.out.println("Name:"+name);
		
	}
	
public static void main(String[] args)
{
	Student s=new Student();	//Default constructor
	Student s1=new Student(2121,"ramkumar");	//Parameterized constructor
	Student s2=new Student(s);	//Copy Constructor
	
}
}
