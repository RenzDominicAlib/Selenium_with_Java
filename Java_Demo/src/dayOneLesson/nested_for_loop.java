package dayOneLesson;

public class nested_for_loop {

	public static void main(String[] args) {
//		halfPyramid();
//		halfPyramid_num();
//		halfPyramid_alp();
//		inverted_halfPyramid();
//		inverted_halfPyramid_num();
		halfPyramid_floyds_tri();
		inverted_halfPyramid_floyds_tri();
		

	}
	
	public static void halfPyramid() {
		int rows = 5;

	    for (int i = 1; i <= rows; i++) {
	    	
	      for (int j = 1; j <= i; j++) {
	        System.out.print("* ");
	      }
	      System.out.println();
	    }
	}
	
	public static void halfPyramid_num() {
		int rows = 5;

	    for (int i = 1; i <= rows; ++i) {
	      for (int j = 1; j <= i; ++j) {
	        System.out.print(j + " ");
	      }
	      System.out.println();
	    }
	}
	
	public static void halfPyramid_alp() {
		 char last = 'E', alphabet = 'A';

		    for (int i = 1; i <= (last - 'A' + 1); ++i) {
		      for (int j = 1; j <= i; ++j) {
		        System.out.print(alphabet + " ");
		      }
		      ++alphabet;

		      System.out.println();
		    }
		  
	}
	
	public static void inverted_halfPyramid() {
		int rows = 5;

	    for (int i = rows; i >= 1; --i) {
	      for (int j = 1; j <= i; ++j) {
	        System.out.print("* ");
	      }
	      System.out.println();
	    }
		  
	}
	
	public static void inverted_halfPyramid_num() {
		int rows = 5;

	    for (int i = rows; i >= 1; --i) {
	      for (int j = 1; j <= i; ++j) {
	        System.out.print(j + " ");
	      }
	      System.out.println();
	    }
		  
	}
	
	public static void halfPyramid_floyds_tri() {
		
		int j = 1;
		for(int i=1; i<5; i++) {
			
			for(int k=1; k<=i; k++) {
			System.out.print(j);
			System.out.print("\t");
			j++;
			}
			
			System.out.println();
		}
		  
	}
	
	public static void inverted_halfPyramid_floyds_tri() {
			
			int j = 1;
			for(int i=4; i>0; i--) {
				
				for(int k=1; k<=i; k++) {
				System.out.print(j);
				System.out.print("\t");
				j++;
				}
				
				System.out.println();
			}
			  
		}
	
	
	
	

}
