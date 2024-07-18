package hashmaplab;
//Write a program in Java to create a Map Interface where we can store the cricketer name in it along with his scores and search for the batsman name and display his score. [Hint:use containsKey() method to search batsman name] 
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CricketerScores {

    public static void main(String[] args) {
        // Create a Map to store cricketer names and their scores
        Map<String, Integer> cricketerScores = new HashMap<>();

        // Adding some cricketers and their scores to the Map
        cricketerScores.put("Sachin Tendulkar", 18426);
        cricketerScores.put("Ricky Ponting", 13704);
        cricketerScores.put("Virat Kohli", 12040);
        cricketerScores.put("Brian Lara", 10405);
        cricketerScores.put("AB de Villiers", 9577);

        // Display the cricketer names and their scores
        System.out.println("Cricketer scores: " + cricketerScores);

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the name of the cricketer to search
        System.out.println("Enter the name of the cricketer to search for:");
        String cricketerName = scanner.nextLine();

        // Search for the cricketer name and display the score
        if (cricketerScores.containsKey(cricketerName)) {
            int score = cricketerScores.get(cricketerName);
            System.out.println(cricketerName + " has scored " + score + " runs.");
        } else {
            System.out.println(cricketerName + " is not in the list.");
        }

        
    }
}

