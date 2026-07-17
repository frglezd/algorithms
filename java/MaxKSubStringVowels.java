class MaxKSubStringVowels {
    public int maxVowels(String s, int k) {
        
        
        int windowStart = 0;
        int windowCount=0;
        int maxCount=0;
        for(int windowEnd = 0; windowEnd < s.length(); windowEnd++){
            char ch = s.charAt(windowEnd);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
                windowCount++;
            }
            if(windowEnd >= k-1){
                if(windowCount >= maxCount){
                    maxCount = windowCount;
                }
                char z =s.charAt(windowStart);
                if(z == 'a' || z == 'e' || z == 'i' || z == 'o' || z == 'u' )
                    windowCount = windowCount - 1;
                windowStart++;
            }
        }
        return maxCount;
        
    }

    public static void main(String[] args) {
        MaxKSubStringVowels sol = new MaxKSubStringVowels();
        String test = "abciiidef";
        int result = sol.maxVowels(test, 3);
        System.out.println(result);
    }
}