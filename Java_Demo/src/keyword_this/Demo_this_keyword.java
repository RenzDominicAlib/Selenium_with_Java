package keyword_this;

public class Demo_this_keyword {

	// Global variable
	int myNum = 100;
	
	public void getData() {
		// Local vaiable with the same name as global variable
		int myNum = 555;
		
		// you will access the local variable
		System.out.println(myNum);
		
		// using this keyword you can access the global or class-level variable
		System.out.println(this.myNum);
		
		// combining global and local variable
		int newNum = myNum + this.myNum;
		System.out.println(newNum);
	}
	
	public static void main(String[] args) {
		
		Demo_this_keyword th = new Demo_this_keyword();
		th.getData();
		

	}

}
