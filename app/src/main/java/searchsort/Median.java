package searchsort;

/**
 * The median is the middle value in an ordered integer list.
 * If the size of thelist is even,the median is the mean of the two
 * middle values.
 */
public class Median {
    /**
     * Find the median of the array arr using QuickSort algorithm.
     */
    public double findQuick(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0.0;
        }
 
        QuickSort quickSort = new QuickSort();
        quickSort.sort(arr);
        double i = (arr[0] + arr[arr.length - 1]) / 2;
        return i;
    }

    /**
     * Find the median of the array arr using MergeSort algorithm.
     */
    public double findMerge(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0.0;
        }
 
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(arr);
        double i = (arr[0] + arr[arr.length - 1]) / 2;
        return i;
    }

    /**
     * Find the median of the array arr using InsertionSort algorithm.
     */
    public double findInsertion(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0.0;
        }
 
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(arr);
        double i = (arr[0] + arr[arr.length - 1]) / 2;
        return i;
    }

}
