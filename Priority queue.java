priority queue:

public class MinHeapPriorityQueue {
    private int[] heap;
    private int size;
    private int capacity;

    // Constructor to initialize the priority queue with a given capacity
    public MinHeapPriorityQueue(int capacity) {
        this.capacity = capacity;
        this.heap = new int[capacity];
        this.size = 0;
    }

    // Method to insert an item into the priority queue
    public void insert(int item) {
        if (size == capacity) {
            throw new RuntimeException("Priority queue is full");
        }
        heap[size] = item;
        size++;
        heapifyUp(size - 1);
    }

    // Method to delete and return the item with the smallest value
    public int deleteMin() {
        if (isEmpty()) {
            throw new RuntimeException("Priority queue is empty");
        }
        int minItem = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapifyDown(0);
        return minItem;
    }

    // Method to check if the priority queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Method to get the number of elements in the priority queue
    public int size() {
        return size;
    }

    // Helper method to maintain the heap property from bottom to top
    private void heapifyUp(int index) {
        int parentIndex = (index - 1) / 2;
        while (index > 0 && heap[index] < heap[parentIndex]) {
            swap(index, parentIndex);
            index = parentIndex;
            parentIndex = (index - 1) / 2;
        }
    }

    // Helper method to maintain the heap property from top to bottom
    private void heapifyDown(int index) {
        int smallest = index;
        int leftChild = 2 * index + 1;
        int rightChild = 2 * index + 2;

        if (leftChild < size && heap[leftChild] < heap[smallest]) {
            smallest = leftChild;
        }
        if (rightChild < size && heap[rightChild] < heap[smallest]) {
            smallest = rightChild;
        }
        if (smallest != index) {
            swap(index, smallest);
            heapifyDown(smallest);
        }
    }

    // Helper method to swap two elements in the heap
    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public static void main(String[] args) {
        MinHeapPriorityQueue pq = new MinHeapPriorityQueue(10);
        pq.insert(10);
        pq.insert(20);
        pq.insert(5);
        pq.insert(7);
        pq.insert(8);

        System.out.println("Priority Queue size: " + pq.size()); // Output: 5
        System.out.println("Min item: " + pq.deleteMin()); // Output: 5
        System.out.println("Min item: " + pq.deleteMin()); // Output: 7
        System.out.println("Priority Queue size: " + pq.size()); // Output: 3
        System.out.println("Is Priority Queue empty? " + pq.isEmpty()); // Output: false
    }
}

output

Priority Queue size: 5
Min item: 5
Min item: 7
Priority Queue size: 3
Is Priority Queue empty? false
