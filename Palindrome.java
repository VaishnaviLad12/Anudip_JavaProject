Palindrome

import java.util.Stack;
import java.util.Scanner;

public class PalindromeChecker {

    public static boolean isPalindrome(String str) {
        Stack<Character> stack = new Stack<>();

        // Push all characters of the string onto the stack
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        // Check if the characters read from the stack match the characters of the string
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to check if it is a palindrome:");
        String input = scanner.nextLine();

        boolean result = isPalindrome(input);

        if (result) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is not a palindrome.");
        }

        scanner.close();
    }
}

O/P:

Enter a string to check if it is a palindrome:
racecar
The string "racecar" is a palindrome.

Enter a string to check if it is a palindrome:
hello
The string "hello" is not a palindrome.
