package dayOneLesson;

public class Assignment_operators_demo {

	public static void main(String[] args) {
		// Day 1 Lesson about logical statements

//		String name = "Renz";				
		// Conditional/comparison operators (== , != , <= , >= ) 
		// 					&& - AND ; || - OR
//		int age = 1;
//		
//		if((age >= 18) && age <= 64) {
//			System.out.println("Allowed to drink!");
//		}
//		else if(age >= 65 || (age >= 15 && age <= 17)) {
//			System.out.println("Allowed to drink but need Permits!");
//		}
//		else {
//			System.out.println("NOT Allowed to drink!");
//		}
	
		
//		int i = 1;
//		 i = i + 1;   // i++
//		 System.out.println(i);
//		 i = i + 1;   // i++
//		 System.out.println(i);
//		 i = i + 1;   // i++
//		 System.out.println(i);
		
//		int x = 0;
//		while (x < 10){
//			System.out.println(x);
//			x++;
//		}
//		
//		// 0 , 1, 2, 3, 4, 5, 6, 7, 8, 9
			
//		String words = "Hello PH";
//		
//		for(int i = 0; i < 50; i++) {	
//			System.out.println(words);
//		}
		
//		
		
		String pet = "Cat"; 
		String name = "Renzo";
		int noOfPrints = 5;
		// if your pet is Cat, print "I love cat" 10 times
		// if your pet is Dog, print "I love Dog" 5 times
		// but if your pet is not a dog nor cat, print "I dont have dog and cats" 1 time.
		
		if(pet == "Cat") {
			for(int x=0 ; x<10 ; x++) {
				System.out.println("I love " + pet);
			}
		}
		else if (pet == "Dog") {	
			for(int x=0 ; x<5 ; x++) {
				System.out.println("I love " + pet);
			}
		}
		else {
			System.out.println("I dont have dog and cats");
		}
		
		
		
		
		
		
	}

}
