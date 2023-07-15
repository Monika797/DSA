package Graphs;

import java.util.*;

class Pair {
    int i;
    int j;
    int t;

    Pair(int _i, int _j, int _t) {
        this.i = _i;
        this.j = _j;
        this.t = _t;
    }
}

public class rotten_oranges {

    public static int orangesRotting(int[][] grid) {

        int r = grid.length;
        int c = grid[0].length;

        Queue<Pair> q = new LinkedList<>();
        int visited[][] = new int[r][c];

        int cntfresh = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] == 2) {
                    q.add(new Pair(i, j, 0));
                    visited[i][j] = 2;
                } else {
                    visited[i][j] = 0;
                }

                if (grid[i][j] == 1) {
                    cntfresh++;
                }
            }
        }
        int tm = 0;
        int cnt = 0;
        int dx[] = { -1, 0, 1, 0 };
        int dy[] = { 0, 1, 0, -1 };
        while (q.size() != 0) {

            Pair p = q.remove();

            tm = p.t;
            for (int i = 0; i < 4; i++) {
                int nrow = p.i + dx[i];
                int ncol = p.j + dy[i];
                if (nrow >= 0 && nrow < r && ncol >= 0 && ncol < c && visited[nrow][ncol] == 0
                        && grid[nrow][ncol] == 1) {
                    q.add(new Pair(nrow, ncol, p.t + 1));
                    visited[nrow][ncol] = 2;
                    grid[nrow][ncol] = 2;
                    cnt++;
                }
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(grid[i][j]);

            }
            System.out.println();
        }

        return cnt == cntfresh ? tm : -1;
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 1 }, { 1, 1, 0 }, { 0, 0, 1 } };
        int rotting = orangesRotting(arr);
        System.out.print(rotting);

    }

}
