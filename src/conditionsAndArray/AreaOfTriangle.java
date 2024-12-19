package conditionsAndArray;
/////////////////////////////////////////
class Area								//new interface
{
	static int areaTriangle(int l,int b)
	{
		return(l*b);
	}
}
//////////////////////////////////////////
public class AreaOfTriangle 			//main class
{
	void add(int a,int b)
		{
			System.out.println("Add :"+(a+b));
		}
		
	int mul(int a,int b)
		{
		return a*b;	
		}
		
	static double area(int r)
		{
			return 3.14*r*r;
		}
	

		public static void main(String[] args)
			{
				AreaOfTriangle t=new AreaOfTriangle();
				t.add(30, 40);
				
				int m=t.mul(10, 20);
				System.out.println("multi:"+m);
				
				double ar=area(3);
				System.out.println(ar);
			
				int tr=Area.areaTriangle(30, 2);
				System.out.println(tr);
				
			}
}
