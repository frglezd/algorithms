class LongestOnes {
    public static int longestOnes(int[] nums, int k) {

        int windowStart = 0;
        int zeroCount=0;
        int maxCount=0;

        for(int windowEnd = 0; windowEnd < nums.length; windowEnd++){
            if(nums[windowEnd] == 0){
                zeroCount++;
                
            }
            if (zeroCount > k) {
                if (nums[windowStart] == 0) {
                    zeroCount--;
                }
                windowStart++;
            }
            maxCount = Math.max(maxCount, windowEnd - windowStart + 1);
        }
        return maxCount;
        
    }

    public static void main(String[] args){
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        System.out.println(longestOnes(nums, 2));
    }
    
}