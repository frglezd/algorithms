public class MergeAlternately {
    public static String mergeAlternately(String word1, String word2) {
        int i= 0;
        int j = 0;
        StringBuilder res = new StringBuilder("");

        for(int idx = 0; idx < Math.min(word1.length()-1,+word2.length()-1); idx++){
            if(word1.charAt(i) < word2.charAt(j)){
                res.append(word1.charAt(i));
                res.append(word2.charAt(j));
            }else{
                res.append(word2.charAt(j));
                res.append(word1.charAt(i));
            }
            i++;
            j++;
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
        String solution = mergeAlternately(word1, word2);
        System.out.println(solution);
    }
}