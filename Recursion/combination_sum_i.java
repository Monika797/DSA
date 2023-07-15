//https://takeuforward.org/data-structure/combination-sum-1/

import java.util.*;

class Solutions {
    public void Combination_Sum(int idx, int target, List<Integer> ds, List<List<Integer>> ans, int[] arr) {
        // if (target == 0) {
        // ans.add(new ArrayList<>(ds));
        // return;
        // }

        if (idx == arr.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        if (arr[idx] <= target) {
            ds.add(arr[idx]);
            Combination_Sum(idx, target - arr[idx], ds, ans, arr);
            ds.remove(ds.size() - 1);
        }

        Combination_Sum(idx + 1, target, ds, ans, arr);
    }
}

class Mainss {

    public static void main(String[] args) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        System.out.println("GfG!");
        int[] a = { 2, 3, 6, 7 };

        Solutions sol = new Solutions();
        sol.Combination_Sum(0, 7, ds, ans, a);
        System.out.println("Combinations sums are: ");
        for (int i = 0; i < ans.size(); i++) {
            for (int j = 0; j < ans.get(i).size(); j++) {
                System.out.print(ans.get(i).get(j) + " ");
            }
            System.out.println();
        }

    }
}