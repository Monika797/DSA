package Sortingg;

public class Recursive_selection_sort {

    public static void selection_sort_recur(int[] arr, int range_start_index) {

        if (range_start_index == arr.length - 1)
            return;

        int min = range_start_index;
        for (int j = range_start_index; j < arr.length; j++) {
            if (arr[j] < arr[min]) {
                min = j;
            }
        }
        // swap i with min
        int temp = arr[range_start_index];
        arr[range_start_index] = arr[min];
        arr[min] = temp;
        selection_sort_recur(arr, range_start_index + 1);

    }

    public static void main(String[] args) {
        int[] arr = { 2, 13, 4, 1, 3, 6, 29 };
        System.out.print("Array before sorting : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        int n = arr.length;
        selection_sort_recur(arr, 0);
        System.out.print("Array after sorting : ");
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

}
