package hashmaplab;
//Write a Java program that demonstrates the functionality of this dictionary application using a TreeMap. Your program should include the following features: i)A TreeMap named dictionary to store word-definition pairs. ii)A way to input word-definition pairs and add them to the dictionary. iii)A way to retrieve and display the definition of a specific word. iv)An iteration through the dictionary to display all word-definition pairs in alphabetical order based on words.
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class DictionaryApp {
    public static void main(String[] args) {
        // Create a TreeMap named dictionary to store word-definition pairs
        TreeMap<String, String> dictionary = new TreeMap<>();

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Menu for the dictionary application
        while (true) {
            System.out.println("\nDictionary Application Menu:");
            System.out.println("1. Add a word-definition pair");
            System.out.println("2. Retrieve and display the definition of a specific word");
            System.out.println("3. Display all word-definition pairs");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    // Add a word-definition pair
                    System.out.print("Enter the word: ");
                    String word = scanner.nextLine();
                    System.out.print("Enter the definition: ");
                    String definition = scanner.nextLine();
                    dictionary.put(word, definition);
                    System.out.println("Word-definition pair added.");
                    break;
                case 2:
                    // Retrieve and display the definition of a specific word
                    System.out.print("Enter the word to look up: ");
                    String lookupWord = scanner.nextLine();
                    if (dictionary.containsKey(lookupWord)) {
                        System.out.println(lookupWord + ": " + dictionary.get(lookupWord));
                    } else {
                        System.out.println("Word not found in the dictionary.");
                    }
                    break;
                case 3:
                    // Display all word-definition pairs
                    System.out.println("Dictionary contents:");
                    for (Map.Entry<String, String> entry : dictionary.entrySet()) {
                        System.out.println(entry.getKey() + ": " + entry.getValue());
                    }
                    break;
                case 4:
                    // Exit the application
                    System.out.println("Exiting the application. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }
}
