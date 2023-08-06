package Sortingg;

public class Selection_sort {

    public static void selection_sort(int[] arr, int n) {

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            // swap i with min
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

    }

    public static void main(String[] args) {
        int[] arr = { 2, 13, 4, 1, 3, 6, 28 };
        System.out.print("Array before sorting : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        int n = arr.length;
        selection_sort(arr, n);
        System.out.print("Array after sorting : ");
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

}
