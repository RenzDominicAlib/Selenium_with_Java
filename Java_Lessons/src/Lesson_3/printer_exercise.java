package Lesson_3;

public class printer_exercise {

	public static void main(String[] args) {
		// condition: print the name once if the printCopy is less than 3, print the same with printCopy if equal or greater than 3.
		
		String name = "Loki";
		int printCopy = 10;
		int count;
		
		if(printCopy < 3 && printCopy > 0) {
			System.out.println(name);
		}else if(printCopy <= 0) {
			System.out.println("No name was printed,0 and negative value is invalid!");
		}else {
			for(count = 1; count <= printCopy; count++ ) {
				System.out.println(name);
			}
		}

	}

}