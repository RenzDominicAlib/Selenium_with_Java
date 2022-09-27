package java_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class collection_exercise_1 {

	public static void main(String[] args) {
		
		int[] arr1 = {4,5,5,5,4,6,6,9,4};
		
		// in console: 4 - 3, 5 - 3, 6 - 2, 9 - 1
		
		ArrayList<Integer> arrList1 = new ArrayList<Integer>();

		
		for(int i = 0; i<arr1.length; i++) {
			int k = 0;
//			System.out.println(arr1[i]);
			if(!arrList1.contains(arr1[i])) {
				arrList1.add(arr1[i]);
				k++;
				
				for(int j = i+1; j<arr1.length; j++) {
					if(arr1[i] == arr1[j]) {
						k++;
					}
				}	
				System.out.print(arr1[i] + "-" + k);
				System.out.println();
				if(k==1) {
					System.out.println(arr1[i] + " is a unique number");
				}
			}
			
			
		}
		
		
		
	}

}
