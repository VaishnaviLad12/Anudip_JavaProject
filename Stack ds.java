Stack DS

public class Stack {
    private Integer[] stackArray;
    private int top;
    private int maxSize;

    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new Integer[maxSize];
        this.top = -1; // Indicates the stack is empty
    }

    // Push method to add an item to the top of the stack
    public void push(Integer item) {
        if (top == maxSize - 1) {
            throw new StackOverflowError("Stack is full");
        }
        stackArray[++top] = item;
    }

    // Pop method to remove and return the item from the top of the stack
    public Integer pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stackArray[top--];
    }

    // Peek method to return the item at the top of the stack without removing it
    public Integer peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stackArray[top];
    }

    // isEmpty method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element is: " + stack.peek()); // Output: Top element is: 30
        System.out.println("Popped element is: " + stack.pop()); // Output: Popped element is: 30
        System.out.println("Top element after pop is: " + stack.peek()); // Output: Top element after pop is: 20

        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: Is stack empty? false
    }
}


Output:

Top element is: 30
Popped element is: 30
Top element after pop is: 20
Is stack empty? false
