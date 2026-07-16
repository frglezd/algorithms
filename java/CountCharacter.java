class CountCharacter{

    public static int countCharacters(String str, char a){
        int count = 0;
        for(int i = 0 ; i < str.length(); i++){
            if (str.charAt(i) == a ) count++;
        }

        return count;
    }

    public static void main(String[] args){
        char target = 'o';
        String test = "Hello";
        System.out.println(countCharacters(test,target));
    }
}