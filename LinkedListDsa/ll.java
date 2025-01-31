package LinkedListDsa;
class Node
{
    Node node;
    int val;
    Node(int data)
    {
        val = data;
        node = null;
    }
}
public class ll {
    Node head;
    ll()
    {
        head = new Node(val);
    }
    public static void insert(int val)
    {
        if(head==null)
        {
            head =  new Node(val);
        }
        else
        {
            Node tem = head;
            while(tem.next!=null)
            {
                tem = tem.next;
            }
            tem.next = new Node(val);
        }
        return head;
    }
}
