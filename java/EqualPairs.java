import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class EqualPairs {
    public static int equalPairs(int[][] grid) {
        int ans = 0;
        
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i < grid.length; i++){
            String rowStr = Arrays.toString(grid[i]);
            map.put(rowStr, map.getOrDefault(rowStr, 0) + 1);
        }

        for(int i=0; i < grid.length; i++){
            int[] col = new int[grid.length];
            for(int j=0; j < grid.length; j++){
                col[j] = grid[j][i];
            }
            ans = ans + map.getOrDefault(Arrays.toString(col), 0);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] A = {
                { 3, 2, 1 },
                { 1, 7, 6 },
                { 2, 7, 7 }
                
        };
        System.out.println(equalPairs(A));
    }
}