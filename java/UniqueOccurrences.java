
import java.util.HashMap;
import java.util.HashSet;


class UniqueOccurrences {
    public boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer, Integer> numberOccurrences = new HashMap<>();

        for(int i= 0; i < arr.length; i++){
            numberOccurrences.put(arr[i], numberOccurrences.getOrDefault(arr[i], 0) + 1);
        }


        HashSet<Integer> uniqueCounts = new HashSet<>(numberOccurrences.values());

        return uniqueCounts.size() == numberOccurrences.size();
    }

    public static void main(String[] args){
        int[] nums1 = {1,2,3,1};
        int[] nums2 = {2,4,6};

        UniqueOccurrences solution = new UniqueOccurrences();
        System.out.println(solution.uniqueOccurrences(nums1));
    }
}