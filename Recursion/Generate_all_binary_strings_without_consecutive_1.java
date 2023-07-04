//https://www.geeksforgeeks.org/generate-binary-strings-without-consecutive-1s/?utm_source=youtube

import java.util.*;

class Solution {
    public void consecutiveOne(List<Integer> ds, int n, List<List<Integer>> ans) {
        if (ds.size() == n) {
            ans.add(new ArrayList<>(ds));
            // for (int j = 0; j < ds.size(); j++) {
            // System.out.print(ds.get(j) + " ds");
            // }
            System.out.println();
            return;
        }

        ds.add(0);
        consecutiveOne(ds, n, ans);
        ds.remove(ds.size() - 1);
        if (ds.size() == 0 || (ds.size() > 0 && ds.get(ds.size() - 1) == 0)) {
            ds.add(1);
            consecutiveOne(ds, n, ans);
            ds.remove(ds.size() - 1);
        }
    }
}

class Mains {

    public static void main(String[] args) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        System.out.println("GfG!");

        Solution sol = new Solution();
        sol.consecutiveOne(ds, 4, ans);
        System.out.println("Combinations are: ");
        for (int i = 0; i < ans.size(); i++) {
            for (int j = 0; j < ans.get(i).size(); j++) {
                System.out.print(ans.get(i).get(j) + " ");
            }
            System.out.println();
        }

    }
}