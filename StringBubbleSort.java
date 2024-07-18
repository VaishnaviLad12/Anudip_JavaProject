String Bubble Sort

import java.util.Arrays;

public class StringBubbleSortExample {
    // Method to perform Bubble sort on an array of strings
    public static void bubbleSort(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    // Swap arr[j] and arr[j + 1]
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        // Original array of strings
        String[] arr = {"banana", "apple", "cherry", "date", "elderberry"};
        
        // Print original array
        System.out.println("Original array: " + Arrays.toString(arr));

        // Create a copy of the original array for Bubble sort
        String[] bubbleSortedArray = Arrays.copyOf(arr, arr.length);

        // Sort using Bubble sort
        bubbleSort(bubbleSortedArray);
        
        // Print Bubble sorted array
        System.out.println("Array sorted using Bubble sort: " + Arrays.toString(bubbleSortedArray));

        // Create a copy of the original array for Arrays.sort()
        String[] arraySortArray = Arrays.copyOf(arr, arr.length);

        // Sort using Arrays.sort()
        Arrays.sort(arraySortArray);
        
        // Print array sorted using Arrays.sort()
        System.out.println("Array sorted using Arrays.sort(): " + Arrays.toString(arraySortArray));
    }
}


Output:

Original array: [banana, apple, cherry, date, elderberry]
Array sorted using Bubble sort: [apple, banana, cherry, date, elderberry]
Array sorted using Arrays.sort(): [apple, banana, cherry, date, elderberry]
