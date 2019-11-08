import java.util.Arrays;

/**
 * Binary search in sorted array
 */

public class BinarySearch {

    public static void main(String[] args) {
        // Sorted array
        int[] array = new int[] {1,2,3};
        System.out.println(binarySearch(array, 3)); // true
    }

    // Searching x in array
    static boolean binarySearch(int[] array, int x) {
        // Array shrinked to 1 element - time to show result
        if (array.length == 1)
            return (array[0] == x);
        // Find the center of array
        int midIdx = array.length / 2;
        // Wow - x is exactly in the middle
        if (array[midIdx] == x)
            return true;
        // Center element < x - go search the right part of array
        if (array[midIdx] < x) {
            return binarySearch(Arrays.copyOfRange(array, midIdx, array.length), x);
        // Center element > x - go search the left part of array
        } else {
            return binarySearch(Arrays.copyOfRange(array, 0, midIdx), x);
        }
    }

}
