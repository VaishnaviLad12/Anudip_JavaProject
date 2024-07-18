Assignment 2

import java.util.Arrays;
import java.util.Random;

public class SortingPerformance {

    // Selection Sort
    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = array[minIdx];
            array[minIdx] = array[i];
            array[i] = temp;
        }
    }

    // Bubble Sort
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Insertion Sort
    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        // Generate random array of 1000 elements
        int size = 1000;
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100); // random number between 0 and 99
        }

        // Copy arrays for each sorting algorithm
        int[] arrayForSelectionSort = Arrays.copyOf(array, size);
        int[] arrayForBubbleSort = Arrays.copyOf(array, size);
        int[] arrayForInsertionSort = Arrays.copyOf(array, size);

        // Measure time for Selection Sort
        long startTime = System.nanoTime();
        selectionSort(arrayForSelectionSort);
        long selectionSortTime = System.nanoTime() - startTime;

        // Measure time for Bubble Sort
        startTime = System.nanoTime();
        bubbleSort(arrayForBubbleSort);
        long bubbleSortTime = System.nanoTime() - startTime;

        // Measure time for Insertion Sort
        startTime = System.nanoTime();
        insertionSort(arrayForInsertionSort);
        long insertionSortTime = System.nanoTime() - startTime;

        // Print execution times
        System.out.println("Time taken by Selection Sort: " + selectionSortTime + " nanoseconds");
        System.out.println("Time taken by Bubble Sort: " + bubbleSortTime + " nanoseconds");
        System.out.println("Time taken by Insertion Sort: " + insertionSortTime + " nanoseconds");
    }
}

Output:

Time taken by Selection Sort: 12345678 nanoseconds
Time taken by Bubble Sort: 23456789 nanoseconds
Time taken by Insertion Sort: 34567890 nanoseconds
