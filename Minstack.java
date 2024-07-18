Minstack

import java.util.Stack;

public class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    // Constructor to initialize the stacks
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    // Push method to add an item to the stack
    public void push(int item) {
        stack.push(item);
        if (minStack.isEmpty() || item <= minStack.peek()) {
            minStack.push(item);
        }
    }

    // Pop method to remove and return the item from the top of the stack
    public int pop() {
        if (stack.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        int poppedItem = stack.pop();
        if (poppedItem == minStack.peek()) {
            minStack.pop();
        }
        return poppedItem;
    }

    // Top method to return the item at the top of the stack without removing it
    public int top() {
        if (stack.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack.peek();
    }

    // isEmpty method to check if the stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // getMin method to return the minimum element in the stack
    public int getMin() {
        if (minStack.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return minStack.peek();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();

        minStack.push(5);
        minStack.push(3);
        minStack.push(6);
        minStack.push(2);

        System.out.println("Minimum element in the stack: " + minStack.getMin()); // Output: Minimum element in the stack: 2

        minStack.pop();
        minStack.pop();

        System.out.println("Minimum element in the stack: " + minStack.getMin()); // Output: Minimum element in the stack: 3
    }
}

output:

Minimum element in the stack: 2
Minimum element in the stack: 3
