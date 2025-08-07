// Node class
class Node {
    int data;
    Node next;

    // Constructor
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Linked List class
public class Arr2LL {
    Node head;  // Start of the list

    // Method to insert at the end
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            System.out.println(current.next);
            current = current.next;
        }
        current.next = newNode;
    }

    // Method to display the list
    public void display() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " → ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Main method to test the list
    public static void main(String[] args) {
        Arr2LL list = new Arr2LL();

        list.insert(10);
        list.insert(20);
        list.insert(30);

        list.display();  // Output: 10 → 20 → 30 → null
    }
}
