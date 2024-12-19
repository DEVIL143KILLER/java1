package variables;

import java.io.*;

class std	//instant variable
{
	int roll=21;
	int mark=345;
}

public class Devil
{
	public static void main (String[] args) throws IOException
	{
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 std s=new std();
	 int in=56;
	 
	 String i=Integer.toString(in);
	 System.out.println(i);
	 System.out.println(s.roll);
	 
	 
	 
	 
	 
	}
}
