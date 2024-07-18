GenericList.java

import java.util.ArrayList;

public class GenericList<T> {
    private ArrayList<T> list;

    // Constructor
    public GenericList() {
        list = new ArrayList<>();
    }

    // Method to add elements to the list
    public void add(T element) {
        list.add(element);
    }

    // Method to retrieve elements by index
    public T get(int index) {
        if (index >= 0 && index < list.size()) {
            return list.get(index);
        } else {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
    }

    // Method to print the list
    public void print() {
        for (T element : list) {
            System.out.println(element);
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating a GenericList of integers
        GenericList<Integer> intList = new GenericList<>();
        intList.add(10);
        intList.add(20);
        intList.add(30);

        // Printing the integer list
        System.out.println("Integer List:");
        intList.print();

        // Retrieving and printing element by index
        System.out.println("Element at index 1: " + intList.get(1));

        // Creating a GenericList of strings
        GenericList<String> stringList = new GenericList<>();
        stringList.add("Hello");
        stringList.add("World");

        // Printing the string list
        System.out.println("\nString List:");
        stringList.print();
    }
}

Output
 Integer List:
10
20
30
Element at index 1: 20

String List:
Hello
World
