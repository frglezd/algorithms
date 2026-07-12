import java.util.*;

class bruteForceStringMatch2{

	public static int[] brute(String text, String pattern){
		int n = text.length();
		int m = pattern.length();
		int j;
		int count = 0;
		for(int i = 0; i <= (n-m); i++){
			j = 0;
			count++;
			while((j < m) && (text.charAt(i+j) == pattern.charAt(j)) ){
			j++;

			}
			if(j == m){
				System.out.println(count);
				return new int[] {i, count}; // match found at index i
			}
		}
		return new int[] {-1, count}; // no match found
	}

	public static void main(String[] args){

		String Text = "there is more to life than increasing its speed";
		String Pattern = "gandhi";
		System.out.println("Text length: " + Text.length());
		System.out.println("Match found at index " + brute(Text, Pattern)[0]);
		System.out.println("Number of comparisons made " + brute(Text, Pattern)[1]);


	}
}
