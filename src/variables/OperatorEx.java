package variables;

public class OperatorEx {


		public static void main(String[] args) {
			int a=10;
			int b=19;
			int x=a++;//Post increment-->x=a-->a=a+1
			System.out.println("Post incerement : "+x);	//x=10
			System.out.println("Post incerement : "+a);	//a=11
			int y=++b;//pre increment-->a=a+1-->x
			System.out.println("Pre incerement : "+y);	//y=20
			
			int z=1011;
			int z1=~z;
			System.out.println("Invertion : "+z1);
			int add=a+b;
			System.out.println("Addition : "+add);
			
			int a11=35;
			System.out.println("------shift operator--------");
			System.out.println("Right shift " +(a11>>1));//It will half the no
			System.out.println("Left shift " +(a11<<1));//double the number

			System.out.println("------Relational operator--------");
			System.out.println("a>b : "+(a>b));//Relation operator output boolean
			System.out.println("a<b : "+(a<b));
			System.out.println("a==b : "+(a==b));
			System.out.println("a!=b : "+(a!=b));

			System.out.println("------Greatest Of Three--------");			
			int a2=100;
			int b2=200;
			int c2=500;
//							int greater=c2>(a2>b2?a2:b2)?c2:(a2>b2?a2:b2);
//							System.out.println("greater is :"+greater);
							
			if(a2>b2 && a2>c2) 
			{
				System.out.println("a2 is greater ");
			}
			else if(b2>c2 && b2>a2) 
			{
				System.out.println("b2 is greather");
			}
			else 
			{
				System.out.println("c2 is greather");
			}
			
			System.out.println("------logical Operators--------");
			System.out.println("a&b : "+(a2&b2));	//AND operation
			System.out.println("a|b : "+(a2|b2));	//OR operation
			System.out.println("a^b : "+(a2^b2));	//NOT operation
			int max=a2>b2?a2:b2;	//condition?true:false			
			System.out.println("Max : "+max);
		
			System.out.println("------Ternary Operator--------");
			int no=21;
			String res=no%2==0?"Even":"Odd";		//conditional if else method
			System.out.println("Result : "+res);
//			if(no%2==0) {
//				System.out.println("Even");
//			}
//			else{
//				System.out.println("ODD");
//			}
			
			String result=a2>b2?"a2 is greather":"b2 is greater";//condition?true:false	--ternary operator
			System.out.println("Max : "+result);
		
			int x1=6,y1=10,z2=4;
			int largest = z2 > (x1>y1 ? x1:y1) ? z2:(x1>y1 ? x1:y1);	//4>(6>10?6:10) ?4:(6>10?6:10) 
				System.out.println("LArgest: "+largest);
			int temp = x>y ? x:y;//temp=10;
		    int Result = z2>temp ? z2:temp;//1>5?1:5
		    	System.out.println("Largest Number is:"+Result);
		}


}
