public class WordCount {
    public static int wordCount(String str){
        if (str.length()==0) return 0;
        int count = 0;
        /* for(char c : str.toCharArray()){
            if(c == ' '){
                count++;
            }
        } */
       for(int i=0; i < str.length()-1;i++){
            if(str.charAt(i) == ' '){
                count++;
            }
       }
        count++; 
        return count;
    }

    public static void main(String[] args) {
        String test = "hello world test";
        System.out.println(wordCount(test));
    }
}
