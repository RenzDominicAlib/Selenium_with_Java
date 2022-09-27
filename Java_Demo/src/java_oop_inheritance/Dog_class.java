package java_oop_inheritance;

public class Dog_class extends Animal{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog_class labrador = new Dog_class();
		labrador.food_needed();
		labrador.name = "kuki";
		System.out.println(labrador.name);
		labrador.lifespan = 5;
		System.out.println(labrador.lifespan + " years");
		labrador.color = "Black";
		System.out.println(labrador.color);
		labrador.handling_guidelines();
		labrador.health_care();
		labrador.ownership_requirements();
		
		Dog_class shihtzu = new Dog_class();
		shihtzu.food_needed();
		shihtzu.name = "shihchan";
		System.out.println(shihtzu.name);
		shihtzu.lifespan = 3;
		System.out.println(shihtzu.lifespan + " years");
		shihtzu.color = "white";
		System.out.println(shihtzu.color);
		shihtzu.handling_guidelines();
		shihtzu.health_care();
		shihtzu.ownership_requirements();

	}

	public void food_needed() {
		System.out.println("Dog food");
	}
}
