package java_oop_inheritance;

public class Class_main_runner {

	public static void main(String[] args) {
		
		// here you will have value from class B
		Class_B var_x = new Class_B();
		System.out.println(var_x.abc);
		
		// here you will have value from class A
		// this concept is same with:    Webdriver driver = new ChromeDriver();
		
		Class_A var_z = new Class_B();
		System.out.println(var_z.abc);

	}

}
