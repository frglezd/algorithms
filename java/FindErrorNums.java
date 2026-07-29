import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

class FindErrorNums {
    public static int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        int n = nums.length;
        Arrays.sort(nums);
        int repeatedNumber=0;
        int lostNumber = 0;
        int expectedSum = (n*(n+1))/2;
        int arraySum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1)
            repeatedNumber = entry.getKey();
        }

        for(int i=0; i < nums.length; i++){
            arraySum +=nums[i];
        }
        lostNumber = expectedSum - arraySum + repeatedNumber;
        ans[0] = repeatedNumber;
        ans[1] = lostNumber;
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
}