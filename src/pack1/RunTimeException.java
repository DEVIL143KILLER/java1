package pack1;

public class RunTimeException 
{
	public static void main(String[] args) {
		try {
		int a=6;
		int b=3;//0
		int c=a/b;
		System.out.println("C : "+c);
		int arr[]= {1,2,3};
		System.out.println("array elements :"+arr[2]);//arr[3]
		String s="Edubridge";
		//String s=" ";
		//String s=null;
		System.out.println("Length of string :"+s.length());
		//String s1="abc123";
		String s1="123";
		int i=Integer.parseInt(s1);
		System.out.println("i :"+i);
		int arr1[]= {11,2,3};
		System.out.println("array elements :"+arr1[1]);
		//Object obj = new String("Hello");
		Object obj=new Integer(10);
        System.out.println((Integer) obj);
		/* Object obj = new String("123");
		 
	        if (obj instanceof Integer) {
	            System.out.println("**** "+(Integer) obj);
	        }
	        else {
	            System.out.println(obj);
	        }*/
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println(e);
			System.out.println("Exception :"+e);
		}
		catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println("Exception :"+e1.getMessage());
		}
		catch(NullPointerException e2) {
			System.out.println("Exception :"+e2.getMessage());
		}
		catch(NumberFormatException e3) {
			System.out.println(e3);
			System.out.println("Exception :"+e3.getMessage());
		}
		catch(ClassCastException e4) {
			System.out.println(e4);
			System.out.println("Exception :"+e4.getMessage());
		}
		finally {
			System.out.println("Finally block");
		}
	}


}
