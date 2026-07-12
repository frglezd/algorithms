public class FindMaxAverage {
    public static double findMaxAverage(int[] nums, int k) {
        double maxAvg = Double.NEGATIVE_INFINITY;
        double calcAvg=0;
        double subArrSum = 0;
        
        for(int i=0; i <= nums.length-k; i++){
            for(int j = i; j < i + k; j++){
                subArrSum = subArrSum + nums[j];
            }
            calcAvg = subArrSum/k;
            if(maxAvg < calcAvg) maxAvg = calcAvg;
            subArrSum = 0;
        }
        
        return maxAvg;
        
    }

    public static void main(String[] args){
        int[] nums = {1,12,-5,-6,50,3};
        double solution =  
        findMaxAverage(nums, 4);
        System.out.println(solution);
        
    }
}