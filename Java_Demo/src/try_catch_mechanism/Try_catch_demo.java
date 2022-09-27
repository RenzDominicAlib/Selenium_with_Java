package try_catch_mechanism;

// in real-time, it is helpful in handling seasonal pop-ups like christmas greeting pop ups

//NullPointerException.
//ArrayIndexOutOfBoundsException.
//IllegalStateException.
//ClassCastException.
//ArithmeticException.
//IllegalArgumentException.

public class Try_catch_demo {
	
	public void getData() {
		
		int a = 100;
		int b = 0;
		
		int[] arr = new int[5];
		
		try{
//			int result = a/b;
			int result = arr[7];
		}
		
		catch(ArithmeticException ae) {
			System.out.println("Arithmetic Exception error captured");
		}
		
		catch(ArrayIndexOutOfBoundsException be) {
			System.out.println("Array Index Out Of Bounds Exception error captured");
		}
		
		catch(Exception e) {
			System.out.println("Genral Exception error captured");
			System.out.println("Retry/screenshot codes");
		}
		finally {
			// always executing whatever the result
			//in real-time, useful in driver.close to delete all the remaining cookies and proceed to the next test cases
		
			System.out.println("whatever is the result, always executing in try-catch mechanism");
		}
		
		
		
	}
	

	public static void main(String[] args) {
		Try_catch_demo tc = new Try_catch_demo();
		tc.getData();

	}

}
