package Graphs;

import java.util.*;

class Pairs {
    int i;
    int j;
    int d;

    Pairs(int _i, int _j, int _d) {
        this.i = _i;
        this.j = _j;
        this.d = _d;
    }
}

public class Distance_of_nearest_cell_having_1 {

    public static int[][] fillNearestOneDist(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] visited = new int[rows][cols];
        int[][] ans = new int[rows][cols];

        Queue<Pairs> q = new LinkedList<>();

        // find ones and add them to queue with 0 distance and mark them visited

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    q.add(new Pairs(i, j, 0));
                    visited[i][j] = 1;
                }

            }

        }

        int dx[] = { -1, 0, +1, 0 };
        int dy[] = { 0, +1, 0, -1 };

        // Work until queue is empty
        // remove
        // add the distance to dist matrix
        // spread in 4 directions --on condition that valid index and must not be
        // visited
        // add to queue with one more distance and mark it visited

        while (q.size() != 0) {
            Pairs p = q.remove();
            ans[p.i][p.j] = p.d;
            for (int i = 0; i < 4; i++) {
                int nrow = p.i + dx[i];
                int ncol = p.j + dy[i];

                if (nrow >= 0 && nrow < rows && ncol >= 0 && ncol < cols && visited[nrow][ncol] == 0) {
                    q.add(new Pairs(nrow, ncol, p.d + 1));
                    visited[nrow][ncol] = 1;
                }
            }

        }

        return ans;
    }

    public static void main(String[] args) {
        int[][] arr = { { 0, 0, 0 }, { 0, 1, 0 }, { 1, 0, 1 } };

        int dist[][] = fillNearestOneDist(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("-------------------------------------");
        for (int i = 0; i < dist.length; i++) {
            for (int j = 0; j < dist[0].length; j++) {
                System.out.print(dist[i][j]);
            }
            System.out.println();
        }
    }
}
