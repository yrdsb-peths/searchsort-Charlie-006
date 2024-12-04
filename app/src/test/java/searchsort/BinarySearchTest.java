package searchsort;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {

    private final Search binarySearch = new BinarySearch();
    private final Long seed = 12345L;

    @Test
    public void testFindElementPresent() {
        int[] arr = { 1, 2, 3, 4, 5 };
        int result = binarySearch.find(arr, 3);
        assertEquals(2, result);
    }

    @Test
    public void testFindElementNotPresent() {
        int[] arr = { 1, 2, 3, 4, 5 };
        int result = binarySearch.find(arr, 6);
        assertEquals(-1, result);
    }

    @Test
    public void testFindEmptyArray() {
        int[] arr = {};
        int result = binarySearch.find(arr, 1);
        assertEquals(-1, result);
    }

    @Test
    public void testFindSingleElementArray() {
        int[] arr = { 1 };
        int result = binarySearch.find(arr, 1);
        assertEquals(0, result);
    }

    @Test
    public void testFindSingleElementArrayNotPresent() {
        int[] arr = { 1 };
        int result = binarySearch.find(arr, 2);
        assertEquals(-1, result);
    }

    // Test large array
    @Test
    public void testFindLargeArray() {
        int[] arr = Util.generateRandomArray(1000000, seed);
        Arrays.sort(arr);
        int target = arr[0];
        int result = binarySearch.find(arr, target);
        assertEquals(0, result);
    }
}