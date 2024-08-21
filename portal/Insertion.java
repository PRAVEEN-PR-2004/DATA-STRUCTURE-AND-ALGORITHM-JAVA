package portal;
import java.util.*;


class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class Insertion {

    static Node head, tail; // by default initialized to null
    public static int count = 0;

    public static void add(int data) {
        Node temp = new Node(data);
        temp.next = null;

        if (head == null) {
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
    }

    public static void insert(int value, int position) {
        Node newNode = new Node(value);
        position = position - 1; // Convert to zero-based index
        
        if (position < 0) {
            count++;
            System.out.println("Invalid position " + (position + 1)); // Printing position in user terms
            return;
        }

        if (position == 0) {
            
            if (head == null) {
                head = newNode;
                tail = newNode; // List was empty
            } else {
                newNode.next = head;
                head = newNode;
            }
            return;
        }

        // Traverse to the node just before the insertion point
        Node temp = head;
        int index = 0;
        while (temp != null && index < position - 1) {
            temp = temp.next;
            index++;
        }

        // Position is greater than the number of nodes
        if (temp == null) {
            count++;
            System.out.println("Invalid position "+(position+1));
            return;
        }

        // Insert at the end
        if (temp.next == null) {
            temp.next = newNode;
            tail = newNode; // Update tail to the new node
        } else {
            // Insert in the middle
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    // Method to print the LinkedList.
    public static void display() {
        Node currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val;
        //Insertion list = new Insertion();
        
        // Add 4 nodes
        add(10);
        add(20);
        add(30);
        add(40);
        
        // Insert at position
        int pos = sc.nextInt(); // Position to insert
        val = sc.nextInt(); // Value to insert
        insert(val, pos);
        
        // Call this function only for valid positions...add logic for the same
        if (count == 0) {
            display();
        }
    }
}
