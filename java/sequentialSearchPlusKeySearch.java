import java.util.*;

class sequentialSearchPlusKeySearch{

	public static void main(String[] args){
		int count = 0;
		int[] A = {89, 45, 68, 90, 29, 34, 17};
		int size = A.length;
		int i = 0;
		int key = 18;
		A[size-1] = key;

		while(A[i] != key){
			count++;
			i++;
		}
		if (i < size){
			System.out.println("Key value " + A[i] + " found at position " + i);
		}
		else{
			System.out.println(-1);
		}
		System.out.println("Comparisons made: " + count);
	}
}
