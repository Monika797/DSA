//https://takeuforward.org/data-structure/combination-sum-ii-find-all-unique-combinations/

import java.util.*;

class combination_sum_ii {
    static void cs2(int idx, int target, List<Integer> ds, List<List<Integer>> ans, int[] arr) {

        if (target == 0) {
            ans.add(new ArrayList<>(ds));
            // System.out.println("hi");
            return;
        }

        for (int i = idx; i < arr.length; i++) {
            if (i > idx && arr[i] == arr[i - 1])
                continue;
            if (arr[i] > target)
                break;
            // System.out.println("h");
            ds.add(arr[i]);
            cs2(i + 1, target - arr[i], ds, ans, arr);
            ds.remove(ds.size() - 1);
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        int[] a = { 10, 1, 2, 7, 6, 1, 5 };
        int t = 8;
        System.out.println("gfg");
        Arrays.sort(a);
        cs2(0, t, ds, ans, a);

        for (int i = 0; i < ans.size(); i++) {
            for (int j = 0; j < ans.get(i).size(); j++) {
                System.out.print(ans.get(i).get(j));
            }
            System.out.println();
        }
    }

}
