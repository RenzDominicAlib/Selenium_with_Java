package java_collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// creating/accessing element using key and value

public class HashMap_interface_demo {

	public static void main(String[] args) {
		
		HashMap<Integer, String> Map1 = new HashMap<Integer, String>();
		
		Map1.put(0, "Australia");					// adding element key and value
		Map1.put(1, "Bahrain");
		Map1.put(2, "Canada");
		Map1.put(3, "Denmark");
		Map1.put(4, "Egypt");
		Map1.put(5, "New York State");
		System.out.println(Map1);
		System.out.println(Map1.get(2));			// accessing/getting present element value using key
		System.out.println(Map1.get(10));			// accessing/getting not existing element value using key is NULL
		Map1.remove(5);								// removing with the help of element key
		System.out.println(Map1);
		System.out.println(Map1.size());
		System.out.println(Map1.isEmpty());
		System.out.println(" ");
		// convert it to Set to iterate
		Set<Entry<Integer, String>> Map1_AsSet = Map1.entrySet();
		
		Iterator<Entry<Integer, String>> Map1_AsSet_iterator = Map1_AsSet.iterator();
		
		while(Map1_AsSet_iterator.hasNext()) {
			//System.out.println(Map1_AsSet_iterator.next());				//iterating with while loop		
			Map.Entry mp = (Map.Entry)Map1_AsSet_iterator.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		
	}

}
