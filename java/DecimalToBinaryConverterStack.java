import java.util.Stack;

public class DecimalToBinaryConverterStack {
    public static String decimalToBinary(int num) {
        StringBuilder sb = new StringBuilder();
        // ToDo: Write Your Code Here.
        if(num == 0) return "0";
        while(num > 0){
            int remainder = num % 2;
            sb.append(remainder);
            num /= 2;

        }
        sb.reverse();
        return sb.toString();
    }

    public static String decimalToBinaryUsingStack(int num) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        // ToDo: Write Your Code Here.
        if(num == 0) return "0";
        while(num > 0){
            int remainder = num % 2;
            stack.push(remainder);
            num /= 2;
        }while(!stack.isEmpty()){
            sb.append(stack.pop());
        }

        return sb.toString();

    }

    public static void main(String[] args) {
        System.out.println(decimalToBinaryUsingStack(10)); // Output: 1010
        System.out.println(decimalToBinary(0));  // Output: 0
        System.out.println(decimalToBinary(255)); // Output: 11111111
    }
}
