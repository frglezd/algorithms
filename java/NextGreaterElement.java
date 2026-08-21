import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NextGreaterElement {

    public List<Integer> nextLargerElement(List<Integer> arr) {
        List<Integer> res = new ArrayList<>();
        // ToDo: Write Your Code Here.
        Stack<Integer> stack = new Stack<>();
        for(int i = arr.size() - 1; i >= 0; i--){
            while(!stack.isEmpty() && stack.peek() <= arr.get(i)){
                stack.pop();
            }
            if(stack.isEmpty()){
                res.add(-1);
            }else{
                res.add(stack.peek());
            }
            stack.push(arr.get(i));
        }
        return res;
    }

    public static void main(String[] args) {
        NextGreaterElement nge = new NextGreaterElement();
        int[] arr = {4, 5, 2, 25};
        int[] result = nge.nextLargerElement(java.util.Arrays.stream(arr).boxed().toList()).stream().mapToInt(Integer::intValue).toArray();
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

}