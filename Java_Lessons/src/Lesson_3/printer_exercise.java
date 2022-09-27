package Lesson_3;

import java.util.Scanner;

public class printer_exercise {

	public static void main(String[] args) {
		// condition: print the name once if the printCopy is less than 3, print the same with printCopy if equal or greater than 3.
		
//		String name = "Loki";
//		int printCopy = 10;
		int count;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name you want to print: ");
		String name = scan.next();
		System.out.println("Enter your desired number of prints: ");
		int printCopy = scan.nextInt();
		
		if(printCopy < 5 && printCopy > 0) {
			System.out.println(name);
		}else if(printCopy <= 0) {
			System.out.println("Invalid Message: No name was printed,0 and negative value is invalid!");
		}else {
			for(count = 1; count <= printCopy; count++ ) {
				System.out.println(name);
			}
		}

	}

}









 








////condition: 
// 1. You have to include/mention the "Name" you want to print in console
// 2. You have to indicate the "Number of prints" you want.
// 3.a. When you want to print 5 or more copies. The printer will also print 5 or more names. 
//   b. But when you want to print less than 5 copies (1 to 4), the printer will only print one copy of name only.
//   c. Lastly, when you put a Zero or negative value. The printer will print an "Invalid Message: No name was printed,0 and negative value is invalid!"


