package Lesson_4;

public class Method_overloading_challenge_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		calcFeetAndInchesToCentimeters(12, 12);		
		
		calcFeetAndInchesToCentimeters(5);
		

	}
	
	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
	
		if(feet >= 0 && inches >= 0 && inches <= 12){
			
			double inchesTOcm = inches * 2.54d;
			double feetTOcm = feet * 12d * 2.54d;
			double totalCM = inchesTOcm + feetTOcm;
			System.out.println(feet + " feet and "+ inches + " inches is equal to " + totalCM + " centimeters.");	
			return totalCM;		
		}	
		System.out.println("Invalid value");
		return -1;
	}
	
	public static double calcFeetAndInchesToCentimeters(double inches) {
			
			
			if(inches >= 0){
				
				double inchesTOcm = inches * 2.54d;
				System.out.println(inches + " inches is equal to " + inchesTOcm + " centimeters.");
				return inchesTOcm;
				
			}
			System.out.println("Invalid value");
			return -1;
		}
	

}
