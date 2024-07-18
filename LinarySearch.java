Linary search 

public class LinearSearch {
    public static void main(String[] args) {
        // Create an array of integers
        int[] array = {34, 78, 19, 45, 67, 89, 23, 90, 12, 56};
        
        // Element to search for
        int searchElement = 45;
        
        // Call the linear search function
        int result = linearSearch(array, searchElement);
        
        // Display the result
        if (result != -1) {
            System.out.println("Element " + searchElement + " found at index: " + result);
        } else {
            System.out.println("Element " + searchElement + " not found in the array.");
        }
    }
    
    // Linear search function
    public static int linearSearch(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i; // Return the index if element is found
            }
        }
        return -1; // Return -1 if element is not found
    }
}


Output:

Element 45 found at index: 3

Element 100 not found in the array.
