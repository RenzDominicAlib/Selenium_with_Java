package dayOneLesson;

import java.util.Scanner;

public class word_finder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "The quick brown fox jumps over the lazy dog";
		
		System.out.println("Content: "+str);
		
		//adding Scanner
		Scanner scan = new Scanner(System.in);
		// find word in String
		System.out.println("Search: ");
		String toFind = scan.nextLine();
		
		
		int i = str.indexOf(toFind);
		int toFindLength = toFind.length();
		int lastIndex = i + (toFindLength - 1);
		
		if(i>0)
			System.out.println(str.substring(i, i+toFind.length()) + " is start in index: " + i + " then end in index: " + lastIndex);
		else 
			System.out.println("string not found");
	}
		

}
