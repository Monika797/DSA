package Sortingg;

import java.util.*;

public class Bubble_sort {
    public static void main(String[] args) {

        int[] a = { 13, 46, 24, 52, 20, 9 };

        System.out.print("Array before sorting : ");
        for (int i = 0; i < a.length; i++) {

            System.out.print(a[i] + " ");
        }

        System.out.println();

        int n = a.length;
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                // compare the adjacent indexes
                if (a[j] > a[j + 1]) {
                    // swap
                    // System.out.print("swapped");
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }

            }
        }
        System.out.print("Array After sorting : ");
        for (int i = 0; i < a.length; i++) {

            System.out.print(a[i] + " ");
        }
    }

}

// import java.util.*;

// public class Bubble_sort {
// static void bubble_sort(int[] arr, int n) {
// for (int i = n - 1; i >= 0; i--) {
// int didSwap = 0;

// for (int j = 0; j <= i - 1; j++) {
// if (arr[j] > arr[j + 1]) {
// int temp = arr[j];
// arr[j] = arr[j + 1];
// arr[j + 1] = temp;
// didSwap = 1;
// }
// }
// if (didSwap == 0) {
// break;
// }
// }

// System.out.println("After bubble sort: ");
// for (int i = 0; i < n; i++) {
// System.out.print(arr[i] + " ");
// }
// System.out.println();
// }

// public static void main(String args[]) {
// int arr[] = { 13, 46, 24, 52, 20, 9 };
// int n = arr.length;
// System.out.println("Before Using Bubble Sort: ");
// for (int i = 0; i < n; i++) {
// System.out.print(arr[i] + " ");
// }
// System.out.println();
// bubble_sort(arr, n);
// }

// }
