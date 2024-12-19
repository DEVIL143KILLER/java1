package pack1;

class InvalidAgeException extends Exception
{
	public InvalidAgeException(String msg)
	{
		super(msg);	//super as constructor of parent class
	}
}
	
public class Voating
{
	String VoteValidity(int age) throws InvalidAgeException
	{
		if (age<18) 
		{
			throw new InvalidAgeException("Invalid for voting");
		}
		else
		{
		return "Welcome to vote";	
		}
	}

	
	public static void main(String[] args)
	{
	Voating v=new Voating();
	try {
		String s=v.VoteValidity(12);
		System.out.println(s);
	}
	catch (Exception e) {
	e.printStackTrace();
	System.out.println(e.getMessage()+" "+e);
	System.out.println(e);
	}
	}
}
