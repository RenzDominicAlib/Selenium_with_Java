package Lesson_3;

public class Else_if_statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 18;
		
		if(age >= 18 && age < 60) {	
			System.out.println("Allowed to drink liquor");
		}else if(age >= 15 || age <= 17 ){
			System.out.println("Need guardian consent to drink liquor");
		}else{
			System.out.println("NOT allowed to drink liquor");
		}

	}

}
