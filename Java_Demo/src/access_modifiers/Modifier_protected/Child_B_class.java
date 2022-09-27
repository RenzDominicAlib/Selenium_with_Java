package access_modifiers.Modifier_protected;

import access_modifiers.Modifier_public.Parent_class;

public class Child_B_class extends Parent_class{

	public static void main(String[] args) {
		
		Parent_class pcp = new Parent_class();
		System.out.println(pcp.name);
		
		// here you can access the protected variable. but you have to make a setter and getter for protected variable
		System.out.println(pcp.getHash());

	}

}
