import java.util.ArrayList;
import java.util.List;

public class permutation_approch2 {

    static void p2(int idx, int[] arr, List<List<Integer>> ans) {
        if (idx == arr.length) {
            List<Integer> ds = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                ds.add(arr[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i = idx; i < arr.length; i++) {
            swap(idx, i, arr);
            p2(idx + 1, arr, ans);
            swap(idx, i, arr);
        }

    }

    static void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        List<List<Integer>> ans = new ArrayList<>();

        int[] a = { 1, 2, 3 };

        System.out.println("gfg");
        p2(0, a, ans);

        for (int i = 0; i < ans.size(); i++) {
            for (int j = 0; j < ans.get(i).size(); j++) {
                System.out.print(ans.get(i).get(j));
            }
            System.out.println();
        }
    }

}
