
import java.util.Arrays;
import java.util.HashMap;


class BugOccurrences{
    public int[] reorderBugOccurrences(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        System.out.println("Occurrences Map: " + map);
        Integer[] distinctCodes = map.keySet().toArray(new Integer[0]);
        Arrays.sort(distinctCodes, (a, b) -> {
            int freqCompare = map.get(a) - map.get(b);
            if (freqCompare != 0) return freqCompare;
            return a - b;
        });

        System.out.println("Sorted by frequency and value: " + Arrays.toString(distinctCodes));

        int[] result = new int[arr.length];
        int index = 0;
        for (int code : distinctCodes) {
            int freq = map.get(code);
            for (int i = 0; i < freq; i++) {
                result[index++] = code;
            }
        }
        return result;
    }


    public static void main(String[] args){
        int[] nums1 = {8,4,6,5,4,8};
        BugOccurrences solution = new BugOccurrences();
        int[] occurrences = solution.reorderBugOccurrences(nums1);
        System.out.println(Arrays.toString(occurrences));
    }
}