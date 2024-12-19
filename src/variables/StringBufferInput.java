package variables;

//import java.util.*;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.IOException;
import java.io.*;

public class StringBufferInput 
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	//take input from user
		System.out.println("Enter ur name,roll no,percentage,symbol");
		String name=br.readLine();
		//convert String into integer
		int rno=Integer.parseInt(br.readLine());	//change integer to string
		float per=Float.parseFloat(br.readLine());	// change integer to string
		char ch=br.readLine().charAt(0);
		System.out.println("Name: "+name);
		System.out.println("Rollno: "+rno);
		System.out.println("Percentage: "+per);
		System.out.println("character: "+ch);
		
	}
}
	


