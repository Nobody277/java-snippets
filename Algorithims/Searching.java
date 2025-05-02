package Algorithims;

// From top to bottom the code is sorted by speed of the algorithm, from slowest to fastest.
// The fastest algorithm is at the bottom of the file.

public class Searching {

    /**
     * Linear search on an unsorted or sorted array to find the index of the target.
     * Time Complexity: O(n) (Average & Worst Case)
     *
     * @param arr    The array to search in.
     * @param target The target element to find.
     * @return The index of the target element, or -1 if not found.
     * @throws IllegalArgumentException if the array is null or empty.
     */
    public static int linearSearch(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Jump Search on a sorted array to find the index of the target element.
     * Time Complexity: O(√n) (Average & Worst Case)
     *
     * @param arr    The sorted array to search in.
     * @param target The target element to find.
     * @return The index of the target element, or -1 if not found.
     * @throws IllegalArgumentException if the array is null or empty.
     */
    public static int jumpSearch(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }

        int n = arr.length;
        int blockSize = (int) Math.sqrt(n);
        int start = 0;
        int next = blockSize;

        while (start < n && arr[Math.min(next, n) - 1] < target) {
            start = next;
            next += blockSize;
            if (start >= n) {
                return -1;
            }
        }

        for (int i = start; i < Math.min(next, n); i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    /**
     * Binary search on a sorted array to find the index of the target element.
     * Time Complexity: O(log n) (Average & Worst Case)
     *
     * @param arr    The sorted array to search in.
     * @param target The target element to find.
     * @return The index of the target element, or -1 if not found.
     * @throws IllegalArgumentException if the array is null or empty.
     */
    public static int binarySearch(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    /**
     * Interpolation search on a sorted array to find the index of the target element.
     * Time Complexity: O(log log n) (Average, uniform data), O(n) (Worst Case)
     *
     * @param arr    The sorted array to search in.
     * @param target The target element to find.
     * @return The index of the target element, or -1 if not found.
     * @throws IllegalArgumentException if the array is null or empty.
     */
    public static int interpolationSearch(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }

        int low = 0;
        int high = arr.length - 1;

        while (low <= high && target >= arr[low] && target <= arr[high]) {
            if (arr[high] == arr[low]) {
                return (arr[low] == target) ? low : -1;
            }
    
            long num = (long)(target - arr[low]) * (high - low);
            int probe = low + (int)(num / (arr[high] - arr[low]));
    
            if (arr[probe] == target) {
                return probe;
            } else if (arr[probe] < target) {
                low = probe + 1;
            } else {
                high = probe - 1;
            }
        }
        return -1;
    }
}