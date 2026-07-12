public class FindMaxAverageLinear {
    public static double findMaxAverageLinear(int[] nums, int k) {
    double subArrSum = 0;
    for (int j = 0; j < k; j++) {
        subArrSum += nums[j];
    }
    double maxAvg = subArrSum / k;

    for (int i = 1; i <= nums.length - k; i++) {
        subArrSum = subArrSum - nums[i - 1] + nums[i + k - 1];
        double calcAvg = subArrSum / k;
        if (maxAvg < calcAvg) maxAvg = calcAvg;
    }

    return maxAvg;
    }

    public static void main(String[] args){
        int[] nums = {1,12,-5,-6,50,3};
        double solution =  
        findMaxAverageLinear(nums, 4);
        System.out.println(solution);
        
    }
}