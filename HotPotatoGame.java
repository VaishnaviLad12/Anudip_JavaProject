package stackprogram;

//Write a Java program to simulate the "Hot Potato" game using a queue. In this game, players stand in a circle and pass a potato (or any other object) while music plays. When the music stops, the player holding the potato is out. ● Create a queue to represent the circle of players. ● Enqueue player names. ● Dequeue players one by one and enqueue them again to simulate passing the potato. ● Repeat the dequeue and enqueue process, simulating the music stopping and players being eliminated until only one player remains.
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class HotPotatoGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a queue to represent the circle of players
        Queue<String> players = new LinkedList<>();

        // Enqueue player names
        System.out.println("Enter the number of players:");
        int numberOfPlayers = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.println("Enter the names of the players:");
        for (int i = 0; i < numberOfPlayers; i++) {
            String playerName = scanner.nextLine();
            players.add(playerName);
        }

        System.out.println("Enter the number of passes before the music stops:");
        int passes = scanner.nextInt();

        // Simulate the Hot Potato game
        while (players.size() > 1) {
            // Pass the potato by dequeueing and enqueueing players
            for (int i = 0; i < passes; i++) {
                String player = players.poll(); // Dequeue the player at the front
                players.add(player); // Enqueue the player at the end
            }
            // The player holding the potato when the music stops is out
            String eliminatedPlayer = players.poll();
            System.out.println(eliminatedPlayer + " is out!");
        }

        // The last remaining player is the winner
        String winner = players.peek();
        System.out.println("The winner is " + winner + "!");
    }
}

