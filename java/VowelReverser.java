

class VowelReverser {

    public static String reverseVowels(String s) {

        char vowels[] = {'a', 'e', 'i', 'o',  'u', 'A', 'E', 'I', 'O', 'U'};
        char[] characters = s.toCharArray();
        int i=0;
        int j = s.length()-1;
        boolean existsInI= false;
        boolean existsInJ = false;

        while(i < j){
            existsInI = false;
            existsInJ = false;

            for (char c : vowels) {
                if (c == characters[i]) {
                    existsInI = true;
                    break;
                }
            }
            if(!existsInI){
                i++;
                continue;
            }
            for (char c : vowels) {
                if (c == characters[j]) {
                    existsInJ = true;
                    break;
                }
            }
            if(!existsInJ){
                j--;
                continue;
            }
            if (existsInI && existsInJ){
                char temp = characters[i];
                characters[i] = characters[j];
                characters[j] = temp;
                i++;
                j--;
            }
        }
        return new String(characters);
    }
    public static void main(String[] args) {
        
        String input = "hello";
        String result = reverseVowels(input);
        System.out.println(result); // Output: holle
    }
}