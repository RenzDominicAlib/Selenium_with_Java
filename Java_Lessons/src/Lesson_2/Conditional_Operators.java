package Lesson_2;

public class Conditional_Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		
		//AND
		System.out.println(a < b && a == b);
		
		//OR
		System.out.println(a < b || a == b);
				
		//Negate or NOT, expected false
		System.out.println(!(a > b));
		

	}

}
