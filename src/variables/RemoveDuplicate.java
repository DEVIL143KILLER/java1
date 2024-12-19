package variables;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveDuplicate 
{
	public static void main(String[] args)
	{
		System.out.println("enter number of lines :");
		String regex= "\\b(\\w+)(\\s+\\1\\b)+";
		Pattern p=Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
		
		Scanner s=new Scanner(System.in);
		int NumberOfSentence=Integer.parseInt(s.nextLine());
		
		while (NumberOfSentence-- > 0)
		{
			System.out.println("enter text :");
			String input=s.nextLine();
			Matcher m=p.matcher(input);	//input is matched to p
			
			while(m.find())				//return true or false
			{
			input=input.replaceAll((m.group()),m.group(1));	
			}
			System.out.println(input);
		}
		s.close();
	}

}
