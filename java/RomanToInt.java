import java.util.HashMap;
import java.util.Map;

class RomanToInt{
    public static int romanToInt(String s){
        int ans=0;
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i < s.length(); i++){
            int currval = getSymbolValue(s.charAt(i));

            if(i+1 < s.length()){
                int nextval = getSymbolValue(s.charAt(i+1));
                if(currval < nextval){
                    ans = ans - currval;
                }else{
                    ans = ans + currval;
                }
            } else{
                ans += currval;
            }

        }
        return ans;
    }

    private static int getSymbolValue(char symbol) {
        switch (symbol) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("IX"));
        
    }
}