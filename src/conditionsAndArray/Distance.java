package conditionsAndArray;
import java.util.Scanner;
public class Distance 
{
	static int meters(int u,int a,int t)
	{
		return (u*t) + ( a*t*t ) /2 ;
	}
public static void main(String[] args)
{
	int u=36;
	u=u*1000/3600;
	int a=5;
	
	Scanner s=new Scanner(System.in);
	System.out.println("enter time t1 in sec :");
	int t1=s.nextInt();
	System.out.println("enter time t2 in sec :");
	int t2=s.nextInt();

	int distance1=meters(u,a,t1);
	int distance2=meters(u,a,t2);
	System.out.println("Distance in t1 for"+t1+" secconds: "+distance1+" meters ");
	System.out.println("Distance in t2 for"+t2+" secconds: "+distance2+" meters ");
}
}
