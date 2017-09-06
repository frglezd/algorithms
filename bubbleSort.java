import java.util.*;

class bubbleSort{

	
	public static void main(String[] args){
		int[] A = {89, 45, 68, 90, 29, 34, 17};
		int temp;
		
		
		for( int i = 0; i < A.length; i++){

		// list printing
		for(int k = 0; k < A.length; k++){
			System.out.printf(" " + A[k]);
		}
			System.out.println();
			
			for (int j = 0; j < A.length-1-i; j++){
				
				if(A[j+1] < A[j]){
					temp = A[j];
					A[j] = A[j+1];
					A[j+1] = temp;		
				}
			}
		} // end main loop
	}
}
