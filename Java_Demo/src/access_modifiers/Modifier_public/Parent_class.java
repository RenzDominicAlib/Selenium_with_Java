package access_modifiers.Modifier_public;

public class Parent_class {

	private String hash = "qwertyuiop";
	
	public String name = "Parent Name";
	String address = "Address location";
	
	public void getData() {
		System.out.println("Im a parent data");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

}
