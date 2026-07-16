public class IsPalindrome {
    public boolean isPalindrome(String str){
        int left=0;
        int right=str.length()-1;

        while(right > left){
            if(str.charAt(left) != str.charAt(right)) return false;
            right--;
            left++;
        }
        return true;
    }

    public static void main(String[] args) {
        IsPalindrome test = new IsPalindrome();
        System.out.println(test.isPalindrome("racecars"));
    }
}
