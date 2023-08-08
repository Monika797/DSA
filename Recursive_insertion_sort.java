public class Recursive_insertion_sort {

    public static void insertion_sort(int[] arr, int i) {

        if (i == arr.length)
            return;

        int j = i;
        while (j > 0 && arr[j - 1] > arr[j]) {
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
            j--;
        }

        insertion_sort(arr, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 13, 4, 1, 3, 6, 28 };
        System.out.print("Array before sorting : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        int n = arr.length;
        insertion_sort(arr, 0);
        System.out.print("Array after sorting : ");
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

}
