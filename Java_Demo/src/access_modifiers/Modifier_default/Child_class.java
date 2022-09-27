package access_modifiers.Modifier_default;

import access_modifiers.Modifier_public.Parent_class;

public class Child_class {
		
		public static void main(String[] args) {
			
			Parent_class pc = new Parent_class();
			
			System.out.println(pc.name);
			pc.getData();
			
			// you cannot access pc.address, because it has default modifier
			// variable/mwthod with default modifier cannot access in class on different package.
			//System.out.println(pc.address);
			

		}

}
