package Lesson_5;

public class Cat {
	
	private String name;
	private String color;
	private int age;
	
	//setters & getters for private name.
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	//setters & getters for private color.
	public void setColor(String color) {
		if(color == "Green" || color == "Blue") {
			this.color = "no cat has color like this";
		}else {
			this.color = color;
		}

	}
	public String getColor() {
		return this.color;
	}
	
	//setters & getters for private age.
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}
	
	public static void angrySound(String meow) {
		System.out.println(meow);
	}
	
	public void snifSound(String meow) {
		System.out.println(meow);
	}
	

}
