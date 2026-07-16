import java.util.ArrayList;

class Solution {
    public int[] countBits(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
       
        for(int i=0; i <= n ; i++){
            int sum = 0;
            int num = i;

            while(num != 0){
                sum += num%2;
                num /= 2;
            }

            ans.add(sum);
            
        }

        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}

public class CountingBits {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 5;
        int[] result = solution.countBits(n);
        System.out.println(java.util.Arrays.toString(result));
    }
}
