package keyword_super;

public class Class_child extends Class_parent{
	
	
	// accessing parent constructor using super()
	public Class_child() {
		super(); // should be in first line of child constructor
		System.out.println("Im a child class constructor");	
	}
	

	String name = "Im a child name";
	
	
	// accessing overrided parent variable using super
	public void getVarData(){	
		System.out.println(name);	
		// use super to specifically access the overrided variable of parent class
		System.out.println(super.name);
	}
	
	// accessing overrided parent method using super
	public void getData() {
		System.out.println("Im a child getData");
		// use super to specifically access the overrided method of parent class
		super.getData();
		
	}

	public static void main(String[] args) {
		
		Class_child ch = new Class_child();
		ch.getVarData();
		ch.getData();

	}

}
