import java.util.*;

class bruteForceStringMatch{

	public static int brute(String text, String pattern){
		int n = text.length();
		int m = pattern.length();
		int j;
		for(int i = 0; i <= (n-m); i++){
			j = 0;

			while((j < m) && (text.charAt(i+j) == pattern.charAt(j)) ){
			j++;
			}
			if(j == m){
				return i; // match found at index i
			}
		}
		return -1; // no match found
	}

	public static void main(String[] args){

		String Text = "nobody noticed him";
		String Pattern = "not";
		System.out.println("Match found at index " + brute(Text, Pattern));

	}
}
