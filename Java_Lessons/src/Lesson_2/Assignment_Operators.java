package Lesson_2;

public class Assignment_Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = 20;
		int c = 0;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		
		c = a + b;
		System.out.println("c = a + b = " + c);
		
		c -= a;
		System.out.println("c -= a = " + c);
		
		c *= a;
		System.out.println("c *= a = " + c);		
		System.out.println("******************");
		
		a = 10;
		c = 17;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		c /= a;
		System.out.println("c /= a = " + c);
		System.out.println("******************");
		

		a = 10;
		c = 17;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		c %= a;
		System.out.println("c %= a = " + c);
		System.out.println("******************");
		
		int result = 1 + 3;
		System.out.println("result = 1 + 3 = " + result);
		result++;
		System.out.println("result++ = " + result);
		result++;
		System.out.println("result++ = " + result);
		result++;
		System.out.println("result++ = " + result);
		result--;
		System.out.println("result-- = " + result);
		result--;
		System.out.println("result-- = " + result);
	}

}
