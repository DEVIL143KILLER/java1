package conditionsAndArray;
import java.util.Scanner;
public class SwithCase 
{
public static void main(String[] args)
{
	Scanner s=new Scanner (System.in);
	System.out.println("enter a:");
	int a=s.nextInt();
	System.out.println("enter b:");
	int b=s.nextInt();
	System.out.println("enter the method you want to do : + , - , * , / :");
	char m=s.next().charAt(0);
	
	switch (m) 
	{
	case '+': {
			System.out.println("Addition :" + (a+b));
			}
			break;
			
	case '-': {
			System.out.println("Addition :" + (a-b));
			  }
			break;
	case '*': {
			System.out.println("Addition :" + (a*b));
			}
			break;		
	case '/': {
			System.out.println("Addition :" + (a/b));
			}
			break;
	default:
		throw new IllegalArgumentException("Unexpected value: " + m);
	}
	
}
}
