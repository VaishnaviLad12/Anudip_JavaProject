Integer Bubble Sort

import java.util.Arrays;

public class BubbleSortExample {
    // Method to perform Bubble sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        // Original array
        int[] arr = {5, 1, 4, 2, 8};
        
        // Print original array
        System.out.println("Original array: " + Arrays.toString(arr));

        // Create a copy of the original array for Bubble sort
        int[] bubbleSortedArray = Arrays.copyOf(arr, arr.length);

        // Sort using Bubble sort
        bubbleSort(bubbleSortedArray);
        
        // Print Bubble sorted array
        System.out.println("Array sorted using Bubble sort: " + Arrays.toString(bubbleSortedArray));

        // Create a copy of the original array for Arrays.sort()
        int[] arraySortArray = Arrays.copyOf(arr, arr.length);

        // Sort using Arrays.sort()
        Arrays.sort(arraySortArray);
        
        // Print array sorted using Arrays.sort()
        System.out.println("Array sorted using Arrays.sort(): " + Arrays.toString(arraySortArray));
    }
}


Output:

Original array: [5, 1, 4, 2, 8]
Array sorted using Bubble sort: [1, 2, 4, 5, 8]
Array sorted using Arrays.sort(): [1, 2, 4, 5, 8]

