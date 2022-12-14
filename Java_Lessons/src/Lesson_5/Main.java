package Lesson_5;

public class Main {

	public static void main(String[] args) {
		// Different with static and non static void method
		
		// calling static void from other class --- not a good practice
		Dog.angrySound("Roar! Roar!");
		
		// calling non-static void from other class --- GOOD practice
		Dog labrador = new Dog();
		labrador.snifSound("Snif! Snif!");	
		labrador.name = "Bruno";
		labrador.color = "Black";
		labrador.age = 5;
		labrador.skullSize = "30cm";
		labrador.tailLength = "30cm";
		System.out.println(labrador.name);
		System.out.println(labrador.color);
		System.out.println(labrador.age);
		System.out.println(labrador.skullSize);
		System.out.println(labrador.tailLength);
		
		// calling private methods/properties using setter and getter
		Cat persian = new Cat();
		persian.setName("Loki");
		System.out.println(persian.getName());
		
		persian.setColor("Green");
		System.out.println(persian.getColor());
		
		persian.setAge(5);
		System.out.println(persian.getAge());
		
		
	}

}
