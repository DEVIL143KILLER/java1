package conditionsAndArray;

public class WhileAndDowhile 
{
public static void main (String[] args)
{
	int i = 1;
	System.out.println(".............while loop...........");
	
	while(i<=2)
	{
		System.out.println(i);	
		i++;
	}
	
	System.out.println("............do while.............");
	do 
	{
		System.out.println(i++);
	}
	while(i<=4);
//////////////////////////////////String Removal//////////////////////////////////////////////////////////////
	System.out.println("...........String removal.............");
	String s="hello";
	int total=s.length();
	System.out.println("string length :"+total+" \nString is:"+s);
	int countAfterRemoval=s.replace("l", "").length();
	System.out.println(countAfterRemoval);
	System.out.print(s.replace("l", ""));
}
}
