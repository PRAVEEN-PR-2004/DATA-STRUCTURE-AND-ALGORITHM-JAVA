package portal;


import java.util.*;
class Node
{
    int data;
    Node next;
    Node(int val)
    {
        data =val;
        next = null;
    }
}
class Create
{
    Node head;
    Create()
    {
        head = null;
        
    }
    public void insert(int val)
    {
        Node newNode = new Node(val);
        if(head==null)
        {
            head = newNode;
        }
        else
        {
            Node tem=head;
            while(tem.next!=null)
            {
                tem  =tem.next;
            }
            tem.next  =newNode;
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
}
public class Creation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        Create nodCreate = new Create();

        for(int i=0;i<n;i++)
        {
            nodCreate.insert(arr[i]);
        }
        nodCreate.display();
    }
}