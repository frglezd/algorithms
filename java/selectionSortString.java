import java.util.*;

class selectionSortString{

	
	public static void main(String[] args){
		String[] A = {"e", "x", "a", "m", "p", "l", "e"};
		String temp;
		
		for( int i = 0; i < A.length-1; i++){
		
		for(int k = 0; k < A.length; k++){
			System.out.printf(" " + A[k]);
		}
			System.out.println();
			
			for (int j = i+1; j < A.length; j++){
				
				if(A[i].compareTo(A[j]) >0){
					temp =  A[j]; A[j]=A[i]; A[i] = temp;
				}
			}
		}
				
	}
}
