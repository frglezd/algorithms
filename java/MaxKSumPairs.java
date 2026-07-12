import java.util.*;

public class MaxKSumPairs {
    public static String mergeAlternately(String word1, String word2) {
        int i= 0;
        int j = 0;
        StringBuilder res = new StringBuilder("");

        for(int idx = 0; idx < Math.min(word1.length()-1,+word2.length()-1); idx++){
            if(word1.charAt(i) < word2.charAt(j)){
                res.append(word1.charAt(i));
                res.append(word2.charAt(j));
            }else{
                res.append(word2.charAt(j));
                res.append(word1.charAt(i));
            }
            i++;
            j++;
        }
        return res.toString();
    }
    public static int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length-1;
        int i = 0;
        int j = n;
        int count=0;
        while(i < j){
            if(nums[i]+nums[j] == k){
                count++;
                i++;
                j--;
            }
            else if(nums[i]+nums[j] > k){
                j--;
            }else{
                i++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int solution = maxOperations(arr, 5);
        System.out.println(solution);
    }
}