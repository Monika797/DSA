package Graphs;

import java.util.*;

public class Replace_O_with_X {

    public static void dfs(int i, int j, char[][] matrix, int[][] vis) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int dx[] = { -1, 0, +1, 0 };
        int dy[] = { 0, +1, 0, -1 };
        for (int k = 0; k < 4; i++) {
            int nrow = i + dx[k];
            int ncol = j + dy[k];

            if (nrow >= 0 && nrow < rows && ncol >= 0 && ncol < cols && vis[nrow][ncol] == 0
                    && matrix[nrow][ncol] == 'O') {

                vis[nrow][ncol] = 1;
                dfs(nrow, ncol, matrix, vis);
            }
        }

    }

    public static char[][] replaceO(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] visited = new int[rows][cols];
        char[][] ans = new char[rows][cols];

        // COPY GRID INT ANS

        // traverse the boundaries and if O is found , mark it visited and do dfs for O
        // set

        for (int i = 0; i < cols; i++) {
            if (grid[0][i] == 'O') {
                visited[0][i] = 1;
                dfs(0, i, grid, visited);
            }
        }

        // REPLACE Rest of o WITH X
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 'O' && visited[i][j] != 1) {
                    ans[i][j] = 'X';
                }
            }

        }

        return ans;
    }

    public static void main(String[] args) {
        char[][] mat = {
                { 'X', 'X', 'X', 'X' },
                { 'X', 'O', 'X', 'X' },
                { 'X', 'O', 'O', 'X' },
                { 'X', 'O', 'X', 'X' },
                { 'X', 'X', 'O', 'O' } };

        char dist[][] = replaceO(mat);

        System.out.println("-------------------------------------");
        for (int i = 0; i < dist.length; i++) {
            for (int j = 0; j < dist[0].length; j++) {
                System.out.print(dist[i][j]);
            }
            System.out.println();
        }
    }
}
