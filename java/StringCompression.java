class Solution {
    public int compress(char[] chars) {
        int write = 0;
        int i = 0;

        while (i < chars.length) {
            char cur = chars[i];
            int count = 0;
            while (i < chars.length && chars[i] == cur) {
                i++;
                count++;
            }
            chars[write++] = cur;
            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
        }


        //for(int j = write; j < chars.length; j++) {
        //    chars[j] = '\0'; // Optional: Clear the remaining characters
        //}
        for(int k=0; k < write; k++) {
            System.out.print(chars[k]);
        }
        System.out.println();
        return write;
    }
}

public class StringCompression {
    public static void main(String[] args) {
        Solution solution = new Solution();
        char[] input = {'a','a','b','b','c','c','c'};
        int result = solution.compress(input);
        System.out.println(result);
    }
}
