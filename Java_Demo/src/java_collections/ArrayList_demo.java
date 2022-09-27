package java_collections;

import java.util.ArrayList;

// ArrayList accept DUPLICATE VALUES ,while Set do not accept duplicate
// Array has fixed size, while ArrayList can grow dynamically
// in Arraylist, you can access and insert any value in any index

public class ArrayList_demo {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList1 = new ArrayList<String>();
		arrayList1.add("Australia");							// adding without index
		arrayList1.add("Bahrain");
		arrayList1.add("Canada");
		arrayList1.add("Egypt");
		arrayList1.add("Australia");							// arraylist accept duplicate
		System.out.println(arrayList1);
		arrayList1.add(3, "Denmark");							// adding with index
		arrayList1.add("Ohio State");
		arrayList1.add("New York State");
		System.out.println(arrayList1);
		arrayList1.remove("Ohio State");						// removing without index
		arrayList1.remove("New York State");
		System.out.println(arrayList1);
		arrayList1.remove(5);									// removing with index
		System.out.println(arrayList1);
		
		System.out.println(arrayList1.size());					// arraylist size
		System.out.println(arrayList1.get(1));					// getting value using index
		System.out.println(arrayList1.contains("Egypt"));		// Boolean TRUE
		System.out.println(arrayList1.contains("UAE"));			// Boolean FALSE
		
		System.out.println(arrayList1.indexOf("Egypt"));		// getting the index
		System.out.println(arrayList1.indexOf("UAE"));			// -1 by getting the index of not existing element
		System.out.println(arrayList1.isEmpty());				// Boolean checking if not empty
		
		
		

	}

}
