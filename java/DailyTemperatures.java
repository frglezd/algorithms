import java.util.*;

class DailyTemperaturesSolution {
    public int[] dailyTemperatures(int[] temperatures) {
        int days_to_wait[] = new int[temperatures.length];

        for(int i = 0; i < temperatures.length; i++){
            int waiting_days = 0;
            for(int j = i+1; j< temperatures.length; j++){
                waiting_days++;
                if(temperatures[i] < temperatures[j]){
                    days_to_wait[i] = waiting_days;
                    break;
                }
                
            }
        }
        return days_to_wait;
    }
}

class DailyTemperaturesSolutionMonotonic {
    public int[] dailyTemperatures(int[] temperatures) {
        int days_to_wait[] = new int[temperatures.length];
        Deque<Integer> stack = new ArrayDeque<>();
        Arrays.fill(days_to_wait, 0); //default value if no day after exists

        for(int i=0; i < temperatures.length; i++){
            
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                int j = stack.pop();
                days_to_wait[j] = i-j;
            }
            stack.push(i);
        }

        
        return days_to_wait;
    }
}

public class DailyTemperatures {
    public static void main(String[] args) {
        DailyTemperaturesSolutionMonotonic solution = new DailyTemperaturesSolutionMonotonic();
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        // result: [1,1,4,2,1,1,0,0]
        int[] result = solution.dailyTemperatures(temperatures);
        
        for (int days : result) {
            System.out.print(days + " ");
        }
    }
}