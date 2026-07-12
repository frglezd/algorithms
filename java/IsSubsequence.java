class Solution2 {
    public boolean isSubsequence(String s, String t) {
        StringBuilder sb = new StringBuilder(s);
        int idx = 0;
        for(int i=0; i < t.length(); i++){
            
            if (t.charAt(i) == sb.charAt(idx)){
                idx++;
                
            }
            if(idx == s.length()) return true;
        
            
        }
        return false;
        
    }
}

public class IsSubsequence {
    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        String s = "abc";
        String t = "ahbgdc";
        boolean result = solution.isSubsequence(s, t);
        System.out.println(result);
    }
}
