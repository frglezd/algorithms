import java.util.*;

class selectionSort{

	
	public static void main(String[] args){
		int[] A = {89, 45, 68, 90, 29, 34, 17};
		int min, temp;
		
		for( int i = 0; i < A.length-1; i++){
		
		for(int k = 0; k < A.length; k++){
			System.out.printf(" " + A[k]);
		}
			System.out.println();

			min = i;
			
			for (int j = i+1; j < A.length; j++){
				
				if(A[j] < A[min]){
					min = j;
				}
			}

			temp = A[min];
			A[min] = A[i];
			A[i] = temp;		
		}
				
	}
}
