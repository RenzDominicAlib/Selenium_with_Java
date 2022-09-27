package dayOneLesson;

public class matrix_arrays_exer {

	public static void main(String[] args) {

// printing multi-dimensional array in matrix	
		
		int[][] abc = {{5,2,3},{1,4,7},{6,9,8}};
		
		for(int i=0;i<3;i++) {		
			for(int k=0;k<3;k++) {
				System.out.print(abc[i][k]);
				System.out.print(" ");
			}
			System.out.println();
		}

		
// finding the minimum and maximum value
		
		int[][] xyz = {{5,2,3},{1,4,7},{6,9,8}};
		
		int min = xyz[0][0];
		int max = xyz[0][0];
		
		for(int i=0;i<3;i++) {		
			for(int k=0;k<3;k++) {
				if(xyz[i][k] < min) {
					min = xyz[i][k];
				}
				if(xyz[i][k] > max) {
					max = xyz[i][k];
				}				
			}
		}
		System.out.println("the minimum value is: "+min);
		System.out.println("the maximum value is: "+max);
	
	
// finding the minimum then find the maximum value on its column
	
			int[][] arr = {{5,2,3},{1,4,7},{4,9,8}};
			
			for(int i=0;i<3;i++) {		
				for(int k=0;k<3;k++) {
					System.out.print(arr[i][k]);
					System.out.print(" ");
				}
				System.out.println();
			}
			
			int mini = arr[0][0];
			int minColumn = 0;
			int maxi = xyz[0][minColumn];
			
			for(int i=0;i<3;i++) {		
				for(int k=0;k<3;k++) {
					if(arr[i][k] < mini) {
						mini = arr[i][k];
						minColumn = k;
					}	
				}
			}
			System.out.println("the minimum column index is: "+minColumn);
			System.out.println("the minimum value is: "+ mini);
			
			for(int i=0;i<3;i++) {		
					if(arr[i][minColumn] > maxi) {
						maxi = arr[i][minColumn];
					}				
					
			}
			System.out.println("the maximum value in this column is: "+ maxi);
			
		
	}

}
