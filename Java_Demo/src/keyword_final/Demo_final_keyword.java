package keyword_final;


public class Demo_final_keyword extends Demo_final_keyword_parent{

	// Global variable
		final int myNum = 100; //CONSTANT
		//int myNum = 55;
		
		public void getData() {
			
			// you will access the constant variable
			System.out.println(myNum);
			
		}
		
		// we cannot override this method. it is declared as final in parent class
//		public void getStringData() {	
//			System.out.println("Im in a child");	
//		}
		
		public static void main(String[] args) {
			
			Demo_final_keyword fn = new Demo_final_keyword();
			fn.getData();
			

		}

}
