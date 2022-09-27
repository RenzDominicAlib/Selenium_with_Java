package access_modifiers.Modifier_protected;

import access_modifiers.Modifier_public.Parent_class;

public class Child_A_class {

	public static void main(String[] args) {
		Parent_class_prot pc = new Parent_class_prot();
		System.out.println(pc.name);
		System.out.println(pc.password);
		pc.getData();
		
		
		Parent_class pcp = new Parent_class();
		System.out.println(pcp.name);
		
		// here, you cannot access protected variable. you need to inherit it as aparent class to access all the protected variable of that class
//		System.out.println(pcp.hash);
	}

}
