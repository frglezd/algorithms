class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int prefix = 1;
        for (int i = 0; i < n; i++) {
            result[i] = prefix;
            prefix *= nums[i];
        }
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= suffix;
            suffix *= nums[i];
        }
        return result;
    }
}

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] input = {1,2,3,4};
        int[] result = solution.productExceptSelf(input);
        System.out.println(java.util.Arrays.toString(result));
    }
}
    