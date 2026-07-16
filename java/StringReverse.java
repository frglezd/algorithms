public class StringReverse {

    public String stringReverse(String str){
        String rev = "";
        for(int i =str.length()-1; i >= 0; i-- ){
            rev = rev + str.charAt(i);
        }

        return rev;
    }

    public String stringReverse2(String str){
        String rev = "";
        for(char c: str.toCharArray()){
            rev = c + rev;
        }

        return rev;
    }

    public String stringReverseSb(String str){
        return new StringBuilder(str).reverse().toString();
    }

    public String stringReverseSb2(String str){
        StringBuilder sb = new StringBuilder();
        for(int i= str.length()-1; i >=0; i--){
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }

    String invertString(String text) {
        char[] word = text.toCharArray();          // NOT (char*) — this is Java, not C
        char[] reverseWord = new char[word.length]; // arrays need a size
        for (int i = 0; i < word.length; i++) {
            reverseWord[word.length - 1 - i] = word[i];
        }
        return new String(reverseWord);   // NOT reverseWord.toString() — that prints a hash!
    }
    public static void main(String[] args){
        StringReverse str = new StringReverse();
        System.out.println(str.stringReverse("test")); //returns tset
        System.out.println(str.stringReverse2("test")); //returns tset
        System.out.println(str.stringReverseSb("test")); //returns tset
        System.out.println(str.invertString("test")); //returns tset
        System.out.println(str.stringReverseSb2("test")); //returns tset
    }
}
