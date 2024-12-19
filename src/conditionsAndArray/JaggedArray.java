package conditionsAndArray;

	public class JaggedArray 
	{
		public static void main(String[] args) {
			 int[][] jaggedArray = new int[4][];
			 jaggedArray[0] = new int[]{ 1 };
			 jaggedArray[1] = new int[]{ 5, 6, 7 };
			 jaggedArray[2] = new int[]{ 8, 9 };
			 jaggedArray[3] = new int[]{ 10,11,12,13 };
			 System.out.println("Length: "+jaggedArray.length);
			 for (int i = 0; i < jaggedArray.length; i++) {//row


				 for (int j = 0; j < jaggedArray[i].length; j++) {//col


				 System.out.print(jaggedArray[i][j] + " ");


				 }
				 System.out.println();
		}


	}

}
