package StackLinkedList;

class Node {
    Node next;
    int data;

    Node(int val) {
        data = val;
        next = null;
    }
}

public class Stack {
    private Node head, tail;

    Stack() {
        head = null;
        tail = null;
    }

    public void push(int val) {
        Node newnode = new Node(val);
        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {
            tail.next = newnode;
            tail = newnode;
        }
    }

    public void pop() {
        if (head == null) {
            System.out.println("Stack is empty");
            return;
        }
        if (head == tail) {  // If there's only one element
            System.out.println(tail.data);
            head = null;
            tail = null;
        } else {
            Node pre = head;
            while (pre.next != tail) {
                pre = pre.next;
            }
            System.out.println(tail.data);
            pre.next = null;
            tail = pre;
        }
    }

    public void peek() {
        if (tail != null) {
            System.out.println(tail.data);
        } else {
            System.out.println("Stack is empty");
        }
    }
}
