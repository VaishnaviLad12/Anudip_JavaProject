MaxFinder.java
public class MaxFinder {
    // Generic method to find the maximum element in an array
    public static <T extends Comparable<T>> T findMax(T[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }

        T max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(max) > 0) {
                max = arr[i];
            }
        }
        return max;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Test with integers
        Integer[] intArray = {10, 20, 5, 30, 15};
        System.out.println("Maximum integer: " + findMax(intArray));

        // Test with doubles
        Double[] doubleArray = {3.14, 2.71, 1.618, 2.718};
        System.out.println("Maximum double: " + findMax(doubleArray));

        // Test with strings
        String[] stringArray = {"apple", "banana", "orange", "grape"};
        System.out.println("Maximum string: " + findMax(stringArray));
    }
}

Output
Maximum integer: 30
Maximum double: 3.14
Maximum string: orange
