import java.util.LinkedList;
import java.util.Queue;  
/*
Time: O(rows × cols) — each cell is visited and enqueued at most once across all BFS calls, and each visit does O(1) work (checking up to 8 neighbors).

Space: O(rows × cols) — for the visited array plus the BFS queue, which in the worst case (one giant component) can hold up to O(rows × cols) cells.
*/

class ConnectedComponentsGrid {

    private static final int[][] DIRECTIONS = {
            { -1, -1 }, { -1, 0 }, { -1, 1 },
            { 0, -1 }, { 0, 1 },
            { 1, -1 }, { 1, 0 }, { 1, 1 }
    };

    public static int countComponents(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];
        int components = 0;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == 1 && !visited[r][c]) {
                    components++;
                    bfs(grid, visited, r, c);
                }
            }
        }

        return components;
    }

    private static void bfs(int[][] grid, boolean[][] visited, int startRow, int startCol) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] { startRow, startCol });
        visited[startRow][startCol] = true;

        int rows = grid.length;
        int cols = grid[0].length;
        //nr and nc stand for next row and next column, respectively
        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            for (int[] dir : DIRECTIONS) {
                int nr = cell[0] + dir[0];
                int nc = cell[1] + dir[1];
                if (nr >= 0 && nr < rows && nc >= 0 && nc < cols
                        && !visited[nr][nc] && grid[nr][nc] == 1) {
                    visited[nr][nc] = true;
                    queue.add(new int[] { nr, nc });
                }
            }
        }
    }

    public static void main(String[] args) {
/*         int[][] A = {
                { 1, 1, 0, 0, 0 },
                { 0, 1, 0, 0, 1 },
                { 1, 0, 0, 1, 1 },
                { 0, 0, 0, 0, 0 },
                { 1, 0, 1, 0, 1 }
        };
 */
        int[][] B = { {1,1}};

        System.out.println(countComponents(B));
    }
}
