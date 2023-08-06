package Sortingg;

import java.util.*;

public class Recursive_bubble_sort {

    public static void bubble_sort(int[] arr, int n) {
        if (n == 1)
            return;

        for (int i = 0; i <= n - 2; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        bubble_sort(arr, n - 1);

    }

    public static void main(String[] args) {
        int[] arr = { 13, 46, 24, 52, 20, 9 };
        System.out.print("Array before sorting : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        bubble_sort(arr, 6);
        System.out.print("Array before sorting : ");
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}
