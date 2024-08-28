package Cirucularlist;


import java.util.*;

class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}

public class cirucularlinkedlist {
    static Node tail;

    public static void insert(int val) {
        Node newnode = new Node(val);
        if (tail == null) {
            tail = newnode;
            newnode.next = tail; // Circular link
        } else {
            newnode.next = tail.next;
            tail.next = newnode;
            tail = newnode;
        }
    }

    public static int traverseAndFindWinner(int k) {
        Node temp = tail;
        while (temp.next != temp) { 
           
            for (int i = 1; i < k; i++) {
                temp = temp.next;
            }

            
            Node nodeToRemove = temp.next;
            temp.next = nodeToRemove.next;

            
            if (nodeToRemove == tail) {
                tail = temp;
            }

           
            //System.out.println("Removed: " + nodeToRemove.data);
        }

        return temp.data; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        
        for (int i = 1; i <= n; i++) {
            insert(i);
        }

        
        int winner = traverseAndFindWinner(k);
        System.out.println(winner);
    }
}
