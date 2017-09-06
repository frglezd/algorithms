import java.util.*;

class bubbleSortString{

	
	public static void main(String[] args){
		String[] A = {"e", "x", "a", "m", "p", "l", "e"};
		String temp;
		
		
		for( int i = 0; i < A.length; i++){

		// list printing
		for(int k = 0; k < A.length; k++){
			System.out.printf(" " + A[k]);
		}
			System.out.println();
			
			for (int j = 0; j < A.length-i; j++){
				
				if(A[j+1].compareTo(A[j]) < 0){
					temp = A[j];
					A[j] = A[j+1];
					A[j+1] = temp;		
				}
			}
		} // end main loop
	}
}
