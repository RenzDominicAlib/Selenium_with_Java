package Lesson_3;

public class Boolean_exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double myNum1 = 20.00d;
		double myNum2 = 80.00d;
		
		double result = (double)((myNum1 + myNum2) * 100);
		System.out.println("result = myNum1 + myNum2 = " + result);
		
		double remainder = (double)(result % 40.00);
		System.out.println("remainder when " + result + " is divided by 40.0 is " + remainder);
		
		boolean isZero = (remainder == 0d) ? true : false;
		System.out.println("Is the remainder is 0? : " + isZero);
		
		if(isZero != true) {
			System.out.println("Got some remainder!");
		}else {
			System.out.println("No remainder!");
		}

	}

}
