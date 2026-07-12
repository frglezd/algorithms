import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class FindDifference {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();
        

        for(int i=0; i < nums1.length; i++){
            set1.add(nums1[i]);
        }

        for(int i=0; i < nums2.length; i++){
            set2.add(nums2[i]);
        }



        List<Integer> diff1 = new ArrayList<>();
        List<Integer> diff2 = new ArrayList<>();

        for(int num : set1){
            if(!set2.contains(num)){
                diff1.add(num);
            }
        }

        for(int num : set2){
            if(!set1.contains(num)){
                diff2.add(num);
            }
        }

        result.add(diff1);
        result.add(diff2);

        return result;
    }

    public static void main(String[] args){
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,4,6};

        List<List<Integer>> differences = findDifference(nums1, nums2);
        System.out.println(differences);
    }
}