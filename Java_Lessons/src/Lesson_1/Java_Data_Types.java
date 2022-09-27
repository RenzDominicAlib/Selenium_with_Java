package Lesson_1;

import java.util.ArrayList;

public class Java_Data_Types {

	
	public static void main(String[] args) {
		// Main method	
		String name = "Renz";
		int sum = 20 + 7;
		int difference = 20 - 7;
		int product = 2 * 7;
		int quotient = 21 / 7;
		int qty = 23;
		int minInt = Integer.MIN_VALUE;
		int maxInt = Integer.MAX_VALUE;
		float price = (float) 16.5999999;
		float minFloat = Float.MIN_VALUE;
		float maxFloat = Float.MAX_VALUE;
		double cost = 16.5999999;
		double minDouble = Double.MIN_VALUE;
		double maxDouble = Double.MAX_VALUE;
		char code = 'C';
		char degree = '\u00B0';
		char unicodeD = '\u0044';
		char unicodeCredits = '\u00A9';
		boolean isBought = false;
		byte minByte = Byte.MIN_VALUE;
		byte maxByte = Byte.MAX_VALUE;
		byte myNewByteValue = (byte)(maxByte / 2);
		
		int myFirstnum = 20 + 7;
		int mySecondnum = 3;
		int myTotal = myFirstnum + mySecondnum;
//		System.out.println("myTotal = " + myTotal);
		
		int pound = 200;
		double kilogram = pound * 0.45359237d;
//		System.out.println("result : " + pound + "lbs is equal to " + kilogram + "kg");
		
		
		

//		System.out.println("sum = " + sum);
//		System.out.println("difference = " + difference);
//		System.out.println("product = " + product);
//		System.out.println("quotient = " + quotient);
		System.out.println("qty = " + qty);
		System.out.println("Hello " + name + "\u00A9");
//		System.out.println("minInt = " + minInt);
//		System.out.println("maxInt = " + maxInt);
		System.out.println("price = " + price);
//		System.out.println("minFloat = " + minFloat);
//		System.out.println("maxFloat = " + maxFloat);
		System.out.println("cost = " + cost);
//		System.out.println("minDouble = " + minDouble);
//		System.out.println("maxDouble = " + maxDouble);
		System.out.println("code = " + code);
		System.out.println("degree = " + degree);
//		System.out.println("unicodeD = " + unicodeD);
//		System.out.println("unicodeCredits = " + unicodeCredits);
		System.out.println("isBought = " + isBought);
//		System.out.println("minByte = " + minByte);
//		System.out.println("maxByte = " + maxByte);
//		System.out.println("myNewByteValue = " + myNewByteValue);
	
//		*******Array************
		
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 100;
		arr[2] = 1000;
		arr[3] = 10000;
		arr[4] = 100000;
//		System.out.println(arr[0]+","+arr[1]+","+arr[2]+","+arr[3]+","+arr[4]);
		
		int[] arr2 = {20, 200, 2000, 20000, 200000};
//		System.out.println(arr2[0]+","+arr2[1]+","+arr2[2]+","+arr2[3]+","+arr2[4]);
		
		
		
		// 1  2  3
		// 4  5  6
		// 7  8  9
		
		int[][] arr3 = new int[3][3];
		arr3[0][0] = 1;
		arr3[0][1] = 2;
		arr3[0][2] = 3;
		arr3[1][0] = 4;
		arr3[1][1] = 5;
		arr3[1][2] = 6;
		arr3[2][0] = 7;
		arr3[2][1] = 8;
		arr3[2][2] = 9;
		
		for(int i=0;i<3;i++) {		
			for(int k=0;k<3;k++) {
				System.out.print(arr3[i][k]);
				System.out.print(" ");
			}
			System.out.println();
		}
		
		
		int[][] arr4 = {{1,2,3},{2,4,6},{3,6,9}};
		for(int i=0;i<3;i++) {		
			for(int k=0;k<3;k++) {
				System.out.print(arr4[i][k]);
				System.out.print(" ");
			}
			System.out.println();
		}


		
		for(int i = 0; i<arr.length; i++) {
//			System.out.println(arr[i]);
		}
		
		for(int i = 0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		ArrayList<String> arrList_1 = new ArrayList();
		arrList_1.add("Loki");
		arrList_1.add("Bella");
		arrList_1.add("Kurama");
		arrList_1.add("Elli");
		arrList_1.add("Mikay");	
		System.out.println(arrList_1.get(0));
		System.out.println(arrList_1.size());
		
		for(int i = 0; i<arrList_1.size(); i++) {
			System.out.println(arrList_1.get(i));
		}
		
		arrList_1.remove(4);
		
		for(int i = 0; i<arrList_1.size(); i++) {
			System.out.println(arrList_1.get(i));
		}
		
		int[] vars = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for(int i = 0; i<vars.length; i++) {
			
			if(vars[i] % 2 == 0) {
				System.out.println(vars[i]);
			}
		}
		
		
		
		
		
	}

}
