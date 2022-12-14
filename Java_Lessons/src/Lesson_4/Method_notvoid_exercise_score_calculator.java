package Lesson_4;

public class Method_notvoid_exercise_score_calculator {

	public static void main(String[] args) {
		
		scoreCalculator(true, 500, 5, 50);
		
		scoreCalculator(true, 600, 6, 60);
		
		scoreCalculator(true, 700, 7, 70);
		
		boolean isGameover = true;
		int score = 800;
		int level = 8;
		int bonus = 80;
		scoreCalculator(isGameover, score, level, bonus);
		
		scoreCalculator(false, 900, 9, 90);
		
		Method_notvoid_exercise_score_calculator.scoreCalculator(true, 123, 123, 123);

	}
	
	public static int scoreCalculator(boolean isGameover, int score, int level, int bonus) {
		
		if(isGameover == true) {			
			int finalScore = score + (level * bonus);
			System.out.println("score : " + score + " points.");
			System.out.println("bonus score : " + level + " * " + bonus + " : " + (level * bonus) + " points.");
			System.out.println("*** You acquired a total of " + finalScore + " points! ***");
			return finalScore;		
		}
		
		System.out.println("*** INVALID! ***");
		return -1;
		
		
	}

}
