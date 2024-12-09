package searchsort;

public class MergeSort extends Sort {
    /**
     * Sort the array arr using merge sort algorithm.
     */
    @Override
    public void sort(int[] arr) {
        if (arr.length < 2) {
            return;
        }

        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        // Correctly populate left array
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }

        // Correctly populate right array
        for (int i = mid; i < arr.length; i++) {
            right[i - mid] = arr[i];
        }

        sort(left);
        sort(right);
        merge(arr, left, right);
    }

    /*
     * Merge the two sorted arrays left and right into the array arr.
     */
    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0; // left array index
        int j = 0; // right array index
        int k = 0; // merged array index

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < left.length) {
            arr[k++] = left[i++];
        }

        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }
}