Reverse string

import java.util.Scanner;

public class StringReverser {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to reverse:");
        String input = scanner.nextLine();

        String reversed = reverseString(input);

        System.out.println("Reversed string: " + reversed);
        scanner.close();
    }

    public static String reverseString(String input) {
        Stack<Character> stack = new Stack<>(input.length());

        // Push all characters of the string onto the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        StringBuilder reversed = new StringBuilder();

        // Pop all characters from the stack and append to the result
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }

    static class Stack<T> {
        private T[] stackArray;
        private int top;
        private int maxSize;

        @SuppressWarnings("unchecked")
        public Stack(int size) {
            this.maxSize = size;
            this.stackArray = (T[]) new Object[maxSize];
            this.top = -1;
        }

        public void push(T item) {
            if (top == maxSize - 1) {
                throw new StackOverflowError("Stack is full");
            }
            stackArray[++top] = item;
        }

        public T pop() {
            if (isEmpty()) {
                throw new RuntimeException("Stack is empty");
            }
            return stackArray[top--];
        }

        public boolean isEmpty() {
            return top == -1;
        }
    }
}

Output:

Enter a string to reverse:
hello
Reversed string: olleh
