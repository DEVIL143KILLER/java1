package variables;
	//Difference between Static and Instance 
	class VariableDemo 
	{
		static int count = 0;//static 
		int cnt = 0;// Instance
		public void increment() 
		{
			count++;//post increment
		}
		public void incre()
		{
			cnt++;
		}
	}
	public class Increament 
	{
		public static void main(String args[]) 
		{
			/*
			 * static variables are shared among all the instances of the class, they are
			 * useful when we need to do memory management. In some cases we want to have a
			 * common value for all the instances like global variable then it is much
			 * better to declare them static as this can save memory (because only single
			 * copy is created for static variables).
			 */
			VariableDemo obj1 = new VariableDemo();
			VariableDemo obj2 = new VariableDemo();
//			VariableDemo obj3 = new VariableDemo();
//			VariableDemo obj4 = new VariableDemo();
//			obj1.increment();// count=1
//			obj2.increment();//count=2
//			obj3.increment();
//			obj4.increment();
			obj1.incre();	// cnt=1
			obj1.increment();	//count=1	static
			obj1.incre();	// cnt changed as=2
			
	        obj2.increment();	// count=1
	        obj2.increment();	//count changed as=2	static
	        
			System.out.println("Obj1 Static: count is=" + obj1.count);	
			System.out.println("Obj2 Static: count is=" + obj2.count);	
			System.out.println("Obj1 Instance: cnt is=" + obj1.cnt);// 
			System.out.println("Obj2 Instance: cnt is=" + obj2.cnt);// 
//			System.out.println("Obj3 Instance: count is=" + obj3.cnt);// 0
//			System.out.println("Obj4 Instance: count is=" + obj4.cnt);// 0
		}
	}

