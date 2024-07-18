package hashmaplab;
//Write a Java program to associate the specified value with the specified key in a HashMap. [Hint:Create HashMap and store few elements on it] 
import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {
        // Create a HashMap to store key-value pairs
        HashMap<String, Integer> map = new HashMap<>();

        // Store a few elements in the HashMap
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Cherry", 30);
        map.put("Date", 40);

        // Display the elements of the HashMap
        System.out.println("Initial HashMap: " + map);

        // Associate a specified value with a specified key
        String key = "Banana";
        int value = 50;
        map.put(key, value);

        // Display the elements of the HashMap after the update
        System.out.println("Updated HashMap: " + map);

        // Optional: Adding a new key-value pair
        String newKey = "Elderberry";
        int newValue = 60;
        map.put(newKey, newValue);

        // Display the elements of the HashMap after adding a new key-value pair
        System.out.println("HashMap after adding new key-value pair: " + map);
    }
}