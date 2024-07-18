Binary Search implementation

public class BinarySearch {
    public static void main(String[] args) {
        // Create a sorted array of integers
        int[] sortedArray = {12, 19, 23, 34, 45, 56, 67, 78, 89, 90};
        
        // Element to search for
        int searchElement = 45;
        
        // Call the binary search function
        int result = binarySearch(sortedArray, searchElement);
        
        // Display the result
        if (result != -1) {
            System.out.println("Element " + searchElement + " found at index: " + result);
        } else {
            System.out.println("Element " + searchElement + " not found in the array.");
        }
    }
    
    // Binary search function
    public static int binarySearch(int[] array, int element) {
        int left = 0;
        int right = array.length - 1;
        
        while (left <= right) {
            int middle = left + (right - left) / 2;
            
            // Check if element is present at middle
            if (array[middle] == element) {
                return middle;
            }
            
            // If element is greater, ignore left half
            if (array[middle] < element) {
                left = middle + 1;
            } 
            // If element is smaller, ignore right half
            else {
                right = middle - 1;
            }
        }
        
        // Element is not present in array
        return -1;
    }
}


Output:

Element 45 found at index: 4

Element 100 not found in the array.
