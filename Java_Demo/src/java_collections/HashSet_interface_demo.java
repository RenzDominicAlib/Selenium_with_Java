package java_collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// ArrayList accept DUPLICATE VALUES ,while Set do not accept duplicate
// Random order, there is no guarantee that elements will be in sequential order

public class HashSet_interface_demo {

	public static void main(String[] args) {
		
		HashSet<String> set1 = new HashSet<String>();
		set1.add("Australia");							// adding elements
		set1.add("Bahrain");
		set1.add("Canada");
		set1.add("Egypt");
		set1.add("Australia");							// HashSet do not accept duplicate
		System.out.println(set1);
		set1.add("Denmark");							
		set1.add("Ohio State");
		set1.add("New York State");
		System.out.println(set1);
		set1.remove("Ohio State");
		set1.remove("New York State");
		System.out.println(set1);
		System.out.println(set1.isEmpty());				// Boolean checking if not empty
		System.out.println(set1.size());				// HashSet size
		System.out.println(set1.contains("Bahrain"));	// Boolean TRUE
		
		// ITERATOR of HashSet
		System.out.println(" ");
		
		Iterator<String> set1Iterator = set1.iterator();
//		System.out.println(set1Iterator.next());		// go to first element
//		System.out.println(set1Iterator.next());		// go to second element
//		System.out.println(set1Iterator.next());		// go to third element
//		System.out.println(set1Iterator.next());		// go to fourth element
//		System.out.println(set1Iterator.next());		// go to fifth element
		
		while(set1Iterator.hasNext()) {
			System.out.println(set1Iterator.next());	//iterating with while loop
		}
		
	}

}
