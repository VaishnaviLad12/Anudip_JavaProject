Simple queue

public class SimpleQueue {
    private int[] queueArray;
    private int front;
    private int rear;
    private int maxSize;
    private int currentSize;

    // Constructor to initialize the queue
    public SimpleQueue(int size) {
        this.maxSize = size;
        this.queueArray = new int[maxSize];
        this.front = 0;
        this.rear = -1;
        this.currentSize = 0;
    }

    // Method to add an item to the rear of the queue
    public void enqueue(int item) {
        if (currentSize == maxSize) {
            throw new RuntimeException("Queue is full");
        }
        rear = (rear + 1) % maxSize; // Wrap around if necessary
        queueArray[rear] = item;
        currentSize++;
    }

    // Method to remove and return an item from the front of the queue
    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        int item = queueArray[front];
        front = (front + 1) % maxSize; // Wrap around if necessary
        currentSize--;
        return item;
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return currentSize == 0;
    }

    // Method to get the number of elements in the queue
    public int size() {
        return currentSize;
    }

    public static void main(String[] args) {
        SimpleQueue queue = new SimpleQueue(5);
        
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        
        System.out.println("Size of queue: " + queue.size()); // Output: Size of queue: 5
        System.out.println("Dequeue: " + queue.dequeue()); // Output: Dequeue: 10
        System.out.println("Dequeue: " + queue.dequeue()); // Output: Dequeue: 20
        System.out.println("Size of queue: " + queue.size()); // Output: Size of queue: 3
        
        queue.enqueue(60);
        System.out.println("Size of queue: " + queue.size()); // Output: Size of queue: 4
        System.out.println("Dequeue: " + queue.dequeue()); // Output: Dequeue: 30
        System.out.println("Dequeue: " + queue.dequeue()); // Output: Dequeue: 40
        System.out.println("Dequeue: " + queue.dequeue()); // Output: Dequeue: 50
        System.out.println("Dequeue: " + queue.dequeue()); // Output: Dequeue: 60
        
        System.out.println("Is queue empty? " + queue.isEmpty()); // Output: Is queue empty? true
    }
}

output:

Size of queue: 5
Dequeue: 10
Dequeue: 20
Size of queue: 3
Size of queue: 4
Dequeue: 30
Dequeue: 40
Dequeue: 50
Dequeue: 60
Is queue empty? true
