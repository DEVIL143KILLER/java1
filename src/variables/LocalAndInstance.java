package variables;

class SubjectMarks
{
	int tamil;
	int english;
	int cs;
	int java;
}

public class LocalAndInstance 
{
	
	public void StudentAge()	//object 
	{
		int age=15;
		System.out.println("age:"+(age+15));
	}
	public static void main(String[] args)
	{
		LocalAndInstance l=new LocalAndInstance();
		l.StudentAge();
	
		SubjectMarks s1=new SubjectMarks();
		
		s1.tamil=100;
		s1.english=90;
		s1.cs=90;
		s1.java=100;
		
		System.out.println("tamil :"+s1.tamil);
		System.out.println("english :"+s1.english);
		System.out.println("cs :"+s1.cs);
		System.out.println("java :"+s1.java);
	
	}

}
