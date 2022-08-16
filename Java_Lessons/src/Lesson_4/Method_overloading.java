package Lesson_4;

public class Method_overloading {

	public static void main(String[] args) {
		// Method Overloading
		
		int newScore = scoreCalculator("Loki", 10);
		System.out.println("return score is " + newScore + " points.");
		
		scoreCalculator("Loki", 10);
		
		scoreCalculator(9);
	
		scoreCalculator(12, 2);

	}
	
	public static int scoreCalculator(String player, int score) {
				
		System.out.println(player + " has score of " + score + " points.");
		return score*100;
	}
	
	public static int scoreCalculator(int score) {
		
		System.out.println("He has score of " + score + " points.");
		return score*100;
	}
	
	public static void scoreCalculator(int score, int level) {
		
		System.out.println("He has score of " + score + " points in level " + level );
		
		
		
}
		

}
