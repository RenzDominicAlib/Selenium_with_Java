package java_oop_polymorphism;

// in real-time, it can be useful when you have the same method name in different transaction.
//public void payment(String creditCardPW) {}
//public void payment(String debittCardPW) {}

public class overloading {

	
	public static void main(String[] args) {
		overloading ovr = new overloading();
		ovr.getData();
		ovr.getData("Informations");
		ovr.getData("informations", 5);

	}

	public int num = 10;
	
	public void getData() {
		System.out.println("getting the data");
	}
	
	public void getData(String data) {
		System.out.println("getting the data " + data);
	}
	
	public void getData(String data, int qty) {
		System.out.println("getting the data " + qty +" "+ data);
	}
}
