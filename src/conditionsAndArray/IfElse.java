package conditionsAndArray;

import java.util.Scanner;

public class IfElse
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in); 	
			System.out.println("Enter the percentage :");
			int per=s.nextInt();
			
		if (per<=100 && per>90)
		{
			System.out.println("A+ grade");
		}
		else if (per<=89 && per>70)
		{
			System.out.println("A56 grade");
		}
		else 
		{
			System.out.println("Pass");
		}
	}

}
