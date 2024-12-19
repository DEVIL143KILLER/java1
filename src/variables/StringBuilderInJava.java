package variables;

public class StringBuilderInJava {				

		public static void main(String[] args) {
			//Mutable-->We can change content
			//StringBuffer sb=new StringBuffer("hello");
			StringBuilder sb=new StringBuilder("hello");
			System.out.println("Origional String :"+sb);
			
			sb.append("  Java");								//Append
			System.out.println("After Append string :"+sb);
			
			sb.insert(5, " Hi ");								//insert
			System.out.println("After Insertion Of string :"+sb);
			
			sb.delete(5,9);										//delete
			System.out.println("After deletion string :"+sb);
			
			sb.reverse();										 //reverse
			System.out.println("Reverse string :"+sb);
		
		}


}
