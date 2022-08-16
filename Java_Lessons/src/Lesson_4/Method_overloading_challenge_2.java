package Lesson_4;

public class Method_overloading_challenge_2 {

	public static void main(String[] args) {
		
		getDurationString(65, 5);
		
		getDurationString(65);
		
		getDurationString(3600);

	}
	
	public static int getDurationString(int minutes, int seconds) {
		
		if(minutes >= 0 && seconds >= 0 && seconds <= 59){
			
			int totalTime = seconds + (minutes*60);
			int convertedHours = (totalTime/3600);
			int remainingSecs = (totalTime%3600);
			int convertedMins = (remainingSecs/60);
			int convertedSeconds = (remainingSecs%60);				
			System.out.println(convertedHours + "h "+ convertedMins + "m " + convertedSeconds +"s");
			return totalTime;
			
		}	
		System.out.println("Invalid value");
		return -1;
	}
	
	public static int getDurationString(int seconds) {
			
			
		if(seconds >= 0){	
			
			int totalTime = seconds;
			int convertedHours = (totalTime/3600);
			int remainingSecs = (totalTime%3600);
			int convertedMins = (remainingSecs/60);
			int convertedSeconds = (remainingSecs%60);							
			System.out.println(convertedHours + "h "+ convertedMins + "m " + convertedSeconds +"s");
			return totalTime;
			
		}
		System.out.println("Invalid value");
		return -1;
	}
	

}
