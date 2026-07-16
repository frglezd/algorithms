import java.util.*;

public class HashMapWordCount {
    public static HashMap<String, Integer> wordCount(String str){
        HashMap<String, Integer> wCount = new HashMap<>();
        String[] words = str.split(" " );
        for(int i=0; i < words.length; i++){
            wCount.put(words[i], wCount.getOrDefault(wCount, 0) + 1);
        }
        return wCount;
    }

    public static void main(String[] args) {
        String str = "hello world test";
        System.out.println(wordCount(str));
    }
}
