package DoublyLinkedList;
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int val)
    {
        data = val;
        next = null;
        prev = null;

    }
    
}
public class DoublyLinkedList 
{
    Node head;
    Node tail;
    DoublyLinkedList()
    {
        head = null;
        tail = null;
    }
    public void insertAtBeginning(int val)
    {
        Node newnode = new Node(val);
        if(head==null)
        {
            head=newnode;
            tail=newnode;
        }
        else
        {
            head.prev = newnode;
            newnode.next=head;
            head=newnode;
        }
    }
    public void insertAtanyPosition(int pos,int val)
    {
        if(pos==0)
        {
            insertAtBeginning(pos);
        }
        Node newNode = new Node(val);
        Node tem = head;
        
        for(int i=1;i<pos;i++)
        {
            tem = tem.next;
        }
        if(tem==tail)
        {
            newNode.prev = tem;
            tem.next=newNode;
            tail=newNode;
        }
        else
        {

            newNode.next = tem.next;
            newNode.prev = tem;
            tem.next.prev = newNode;
            tem.next=newNode;
        }



    }
    public void insertAtNormal(int val)
    {
        Node newnode = new Node(val);
        if(head==null)
        {
            insertAtBeginning(val);
        }
        else{
            Node tem = head;
            while(tem.next!=null)
            {
                tem=tem.next;
            }
            tem.next = newnode;
            newnode.prev = tem;
            tail= newnode;
        }
    }
    public void delete(int pos)
    {
        if(head==null)
        {
            return;
        }
        if(pos==0)
        {
            if(head==tail)
            {
                head=null;
                tail=null;

            }
            else
            {
                head=head.next;
                head.prev=null;

            }
            return;
        }
        Node tem = head;
        Node pre = null;

        for(int i=1;i<=pos;i++)
        {
            pre = tem;
            tem  =tem.next;
            if(tem==null)
            {
                return;
            }
        }
        if(tem==tail)
        {
            tail=pre;
            pre.next=null;
            tem.prev=null;
        }
        else
        {

            pre.next  =tem.next;
            tem.next.prev = pre;
            tem.next=null;
            tem.prev=null;
        }

    }



    public void display()
    {
        Node tem = head;
        while(tem!=null)
        {
            System.out.print(tem.data+" ");
            tem = tem.next;
        }
    }
    public void revdisplay()
    {
        Node tem = tail;
        while (tem!=null) 
        {
            System.out.print(tem.data+" ");
            tem = tem.prev;            
        }
    }
    
}
