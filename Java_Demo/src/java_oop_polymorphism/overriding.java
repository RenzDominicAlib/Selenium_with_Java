package java_oop_polymorphism;

public class overriding extends overloading {

	public int num = 999;
	
	public static void main(String[] args) {
		
		// overriding the num variable from parent class
		overriding newNum = new overriding();
		System.out.println(newNum.num);
	}

}
