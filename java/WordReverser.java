class WordReverser {
    public static String reverseWords(String s) {
        //s = s.trim();
        String[] words = s.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].trim();
        }
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        
        String input = "a good   example";
        String result = reverseWords(input);
        System.out.println(result); //desired output: example good a
        //actual output: example   good a
    }
}
