package searchsort;

import java.util.Arrays;

public class SelectionSort {
    /**
     * Sort the array arr using selection sort algorithm.
     */
    public static void sort(int[] arr) {
        for (int curIndex = 0; curIndex < arr.length - 1; curIndex++) {
            System.out.println(Arrays.toString(arr));

            int minIndex = findMin(arr, curIndex);

            swap(arr, curIndex, minIndex);
        }
    }

    private static int findMin(int[] arr, int startingIndex) {
        int minIndex = startingIndex;

        for (int i = minIndex + 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    private static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
