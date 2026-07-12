import java.util.*;

class sequentialSearch{

	public static void main(String[] args){
		int[] A = {89, 45, 68, 90, 29, 34, 17};
		int i = 0;
		int k = 18;
		int size = A.length;
		int count = 0;

		while(i < size && A[i] != k){
			count++;
			i++;
		}
		if (i < size){
			System.out.println("Key value " + A[i] + " found at position " + i);
			System.out.println("Comparisons made: " + count);
		}
		else{
			System.out.println("Comparisons made: " + count);
			System.out.println(-1);
		}
	}
}
