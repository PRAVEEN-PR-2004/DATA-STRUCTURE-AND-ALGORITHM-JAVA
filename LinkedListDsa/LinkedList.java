package LinkedListDsa;
class Node
{
    int data;
    Node next;
    Node(int val)
    {
        data = val;
        next = null;

    }
}
public class LinkedList 
{
    Node head;
    LinkedList()
    {
        head=null;
    }
    public void insertAtBeginning(int val)
    {
        Node newnode = new Node(val);
      
            newnode.next=head;
            head=newnode;
        
    }
    public void insertAtNormal(int val)
    {
        Node newnode = new Node(val);
        if(head==null)
        {
            insertAtBeginning(val);
            

        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newnode;

        }
    }
    public void insertAtanyPosition(int pos,int val)
    {
        if(pos==0)
        {
            insertAtBeginning(val);
            return;
        }
        Node newnode = new Node(val);
        Node tem=head;
        for(int i=1;i<pos;i++)
        {
            tem = tem.next;

            // if(tem==null)
            // {
                //throw exception
            // }
        }
        newnode.next = tem.next;
        tem.next=newnode;

    }
    public void display()
    {
        Node tem =head;
        while(tem!=null)
        {
            System.out.print(tem.data+" ");
            tem = tem.next;
        }
    }

    public void delete(int pos)
    {
        if(pos==0)
        {
            
            head=head.next;
            return;


        }
        Node tem = head;
        Node pre = null;
        for(int i=1;i<=pos;i++)
        {
            pre = tem;
            tem = tem.next;     
        }
        pre.next = tem.next;
        tem.next=null;
    }
    public void searchVal(int val)
    {
        Node tem = head;
        int i = 0;
        while(tem!=null)
        {
            if(tem.data == val)
            {
                System.out.println(i);
                return;
            }
            tem = tem.next;
            i++;
        }
        System.out.println(false);
    }
    public void conVal(int val)
    {
        Node tem = head;
        while(tem!=null)
        {
            if(tem.data == val)
            {
                System.out.println(true);
                return;
            }
            tem = tem.next;
        }
        System.out.println(false);
    }
    public void getIndexEle(int i)
    {
        Node tem = head;
        int index=0;
        while(tem!=null &&index<i)
        {
            tem = tem.next;
            index++;
        }
        if(tem!=null)
        System.out.println(tem.data);
    }
    
}