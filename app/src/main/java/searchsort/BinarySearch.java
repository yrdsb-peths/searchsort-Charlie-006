package searchsort;

import org.checkerframework.checker.units.qual.t;

public class BinarySearch extends Search {
    /**
     * Find the index of the target element in the sorted array arr using binary
     * search. Return -1 if target is not found in arr.
     * 
     * {1,2,3,4,5,6} t = 5
     */
    @Override
    public int find(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        
        if(arr[0] == target){
            return 0;
        }

        while (low <= high) {
            int mid = (high + low) / 2;
            int cur = arr[mid];

            if (cur == target) {
                return mid;
            } else if (cur < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    /**
     * Find the index of the target element in the sorted array arr using binary
     * search recursively. Return -1 if target is not found in arr.
     */
    @Override
    public int recursiveFind(int[] arr, int target) {
        if(arr[0] == target){
            return 0;
        }
        return recursiveFindHelper(arr, target, 0, arr.length - 1);
    }
        private int recursiveFindHelper(int[] arr, int target, int low, int high) {
            if (low > high) {
                return -1;
            }

            int mid = (high + low) / 2;
            int cur = arr[mid];

            if (cur == target) {
                return mid;
            } else if (cur < target) {
                return recursiveFindHelper(arr, target, mid + 1, high);
            } else {
                return recursiveFindHelper(arr, target, low, mid - 1);
            }
        }
    }