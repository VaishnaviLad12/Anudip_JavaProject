Assignment 1:

import java.util.Scanner;

public class InsertionSortStrings {
    
    // Method to sort an array of strings using Insertion Sort
    public static void insertionSort(String[] array) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            String key = array[i];
            int j = i - 1;

            // Move elements of array[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && array[j].compareTo(key) > 0) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Asking user for the number of strings
        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        String[] array = new String[n];

        // Getting the strings from the user
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextLine();
        }

        // Sorting the array of strings
        insertionSort(array);

        // Displaying the sorted array
        System.out.println("Sorted list of strings:");
        for (String str : array) {
            System.out.println(str);
        }

        scanner.close();
    }
}

Output:

Enter the number of strings: 4
Enter the strings:
banana
apple
cherry
date
Sorted list of strings:
apple
banana
cherry
date
