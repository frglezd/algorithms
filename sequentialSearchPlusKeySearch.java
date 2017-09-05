import java.util.*;

class sequentialSearchPlusKeySearch{

	public static void main(String[] args){
		int[] A = {89, 45, 68, 90, 29, 34, 17};
		int i = 0;
		int k = 34;
		int size = A.length;

		while(i < size && A[i] != k){
			i++;
		}
		if (i < size){
			System.out.println("Key value " + A[i] + " found at position " + i);
		}
		else{
			System.out.println(-1);
		}
	}
}
