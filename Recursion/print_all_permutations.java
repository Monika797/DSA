
//https://www.youtube.com/watch?v=YK78FU5Ffjw&list=PLgUwDviBIf0rGlzIn_7rsaR2FQ5e6ZOL9&index=14
import java.util.*;

public class print_all_permutations {

    static void permutations(boolean[] visited, List<Integer> ds, List<List<Integer>> ans, int[] arr) {
        if (ds.size() == arr.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i = 0; i < visited.length; i++) {
            if (!visited[i]) {
                ds.add(arr[i]);
                visited[i] = true;
                permutations(visited, ds, ans, arr);
                ds.remove(ds.size() - 1);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        int[] a = { 1, 2, 3 };
        boolean[] v = new boolean[a.length];

        System.out.println("gfg p1");
        permutations(v, ds, ans, a);

        for (int i = 0; i < ans.size(); i++) {
            for (int j = 0; j < ans.get(i).size(); j++) {
                System.out.print(ans.get(i).get(j));
            }
            System.out.println();
        }
    }

}
