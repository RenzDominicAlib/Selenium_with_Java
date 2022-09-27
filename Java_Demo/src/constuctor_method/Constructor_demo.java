package constuctor_method;

// constructor method do not return any value
// constructor has the same name with its class
// multiple constructor with different arguments can be used
// if you define any other parameretized constructor, you are mandatory to define non-parameterized constructor Constructor_demo()



public class Constructor_demo {

	public Constructor_demo() {
		System.out.println("Im inside the constructor");
	}
	
	// Parameterized constructor
	public Constructor_demo(String param1, String param2) {
		System.out.println("Im inside the parameterized constructor with parameters: " + param1 +"," + param2);
	}

	public static void main(String[] args) {
		// constructor will be executed whenever created an object.
		Constructor_demo cd = new Constructor_demo();
		Constructor_demo cdp = new Constructor_demo("first parameters","second parameters");

	}
	
	public void getData() {
		System.out.println("getting data");
	}

}
