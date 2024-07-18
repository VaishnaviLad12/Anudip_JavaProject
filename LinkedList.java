LinkedList Rverse

public class SinglyLinkedList {
    Node head;

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to reverse the linked list in-place
    public void reverse() {
        Node previous = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next; // Save the next node
            current.next = previous; // Reverse the link
            previous = current; // Move previous to current node
            current = next; // Move to the next node
        }
        head = previous; // Update the head to the new first node
    }

    // Method to add a new node at the end of the list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Method to print the linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Original list:");
        list.printList(); // Output: 1 2 3 4 5

        list.reverse();

        System.out.println("Reversed list:");
        list.printList(); // Output: 5 4 3 2 1
    }
}

O/p

Original list:
1 2 3 4 5 
Reversed list:
5 4 3 2 1 
