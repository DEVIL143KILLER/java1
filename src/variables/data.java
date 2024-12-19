package variables;

public class data {
	
	void display()
	{
		System.out.println("Display");
	}
	void displayMsg() 
	{
		System.out.println("****Display msg*****");
	}
	
	public static void main(String[] args)
	{
		String s="Hello";
		System.out.println("Length :"+s.length());
		System.out.println("Char At"+s.charAt(0));
		data i= new data();
		i.display();
		i.displayMsg();
	}

}
