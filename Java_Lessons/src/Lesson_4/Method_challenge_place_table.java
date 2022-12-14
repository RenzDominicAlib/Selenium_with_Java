package Lesson_4;

public class Method_challenge_place_table {

	public static void main(String[] args) {
		
		String name = "Kurama";
		int score = 1500;
		int place = calculateHighScorePosition(score);
		displayHighScorePosition(name, place);
		
		name = "Loki";
		score = 900;
		place = calculateHighScorePosition(score);
		displayHighScorePosition(name, place);

		name = "Bella";
		score = 400;
		place = calculateHighScorePosition(score);
		displayHighScorePosition(name, place);
		
		place = calculateHighScorePosition(50);
		displayHighScorePosition("Cookie", place);
		

	}
	
	public static void displayHighScorePosition(String name, int place) {
		
		System.out.println("*** Congratulations " + name + " you've got the "+ place + " place! ***");
	}
	
	public static int calculateHighScorePosition(int score) {
		
		if(score >= 1000) {
			return 1;
		}else if(score >= 500 && score < 1000) {
			return 2;
		}else if(score >= 100 && score < 500) {
			return 3;
		}else {
			return 4;
		}	
	}

}
