package variables;

public class StringOperation {
	public static void main(String[] args)
	{
	String s="hello java";
	String s1="Aelcome";
	String s2="aelcome";
	System.out.println("Length:"+s1.length());
	System.out.println("Char At:"+s1.charAt(3));
	System.out.println("Upper:"+s1.toUpperCase());
	System.out.println("Lower:"+s1.toLowerCase());
	System.out.println("Equals:"+s1.equals(s2));
	System.out.println("Equals Ignore:"+s1.equalsIgnoreCase(s2));
	System.out.println("compare:"+s1.compareTo(s2));
	System.out.println("compare:"+s2.compareTo(s1));
	System.out.println("Index of letter:"+s1.indexOf('e'));
	System.out.println("LastIndex of letter:"+s1.lastIndexOf('e'));
	System.out.println("concate:"+s1.concat("welcome"));	//add two//
	String s3=("    ");
	System.out.println("is empty:"+s3.isEmpty());
	System.out.println("is blank:"+s3.isBlank()); 
	System.out.println(s);
	}
	

}
