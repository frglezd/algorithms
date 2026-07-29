import java.util.Stack;

class CountStars{
    public static String removeStars(String s){
        Stack<Character> charStack = new Stack<>();
        String res = "";
        for(int i=0; i < s.length(); i++){
            if(s.charAt(i) == '*'){
                charStack.pop();
            }else{
                charStack.push(s.charAt(i));
            }
        }
        while(!charStack.isEmpty()){
            res = charStack.pop() + res;
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "leet**cod*e";
        System.out.println(removeStars(s));
    }
}