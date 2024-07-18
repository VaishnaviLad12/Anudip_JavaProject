package stackprogram;
//Write a Java program that demonstrates the following operations on a HashSet: ● Create a HashSet of integers. ● Add the numbers 5, 10, 15, 20, and 25 to the set. ● Display the elements of the set. ● Check if the set contains the number 10. ● Remove the number 15 from the set. ● Display the size of the set.
import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        // Create a HashSet of integers
        HashSet<Integer> numbers = new HashSet<>();

        // Add the numbers 5, 10, 15, 20, and 25 to the set
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);

        // Display the elements of the set
        System.out.println("Elements in the set: " + numbers);

        // Check if the set contains the number 10
        boolean containsTen = numbers.contains(10);
        System.out.println("Does the set contain the number 10? " + containsTen);

        // Remove the number 15 from the set
        boolean removedFifteen = numbers.remove(15);
        System.out.println("Was the number 15 removed? " + removedFifteen);

        // Display the size of the set
        int setSize = numbers.size();
        System.out.println("Size of the set: " + setSize);
    }
}
