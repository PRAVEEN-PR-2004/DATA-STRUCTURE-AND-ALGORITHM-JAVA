package QueueLinkedList;
class Node{
    int data;
    Node next;
    Node(int val)
    {
        data = val;
        next = null;
    }
}
public class Queue {
    Node head;
    Node tail;
    Queue()
    {
        head = null;
        tail = null;
    }
    public void enqueue(int val)
    {
        Node newnode  =new Node(val);
        if(head==null)
        {
            head=newnode;
            tail = newnode;
            return;
        }
        tail.next=newnode;
        tail = newnode;
    }
    public int dequeue()
    {
        if(head==null)
        {
            System.err.println("Queue is empty");
            return -1;
        }
        int ans = head.data;
        head=head.next;
        if(head ==null)
        {
            tail=null;
        }
        return ans;
    }
}
