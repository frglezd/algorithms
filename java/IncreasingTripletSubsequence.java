public class IncreasingTripletSubsequence {

    public static boolean increasingTriplet(int[] nums) {
        if (nums == null || nums.length < 3) return false;
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n <= first) {
                first = n;
            } else if (n <= second) {
                second = n;
            } else {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        
        int[] input = {2,1,5,0,4,6};
        boolean result = increasingTriplet(input);
        System.out.println(result);
    }

    
}
