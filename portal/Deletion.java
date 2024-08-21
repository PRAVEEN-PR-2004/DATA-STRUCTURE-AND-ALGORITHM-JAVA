package portal;


import java.util.*;
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
public class Deletion
{
    static Node head;
    public static int c=0;
    
    public static void Todelete(int k)
    {
        if(head.data == k)
        {
            head = head.next;
            return;
        }
        
        Node tem  =head;
        Node pre  = null;
        while(tem!=null && tem.data!=k)
        {
            pre = tem;
            tem = tem.next;
            
        }
        if(tem==null)
        {
            System.out.print(k+" Not in List");
            c++;
            return;
        }
        if(tem.data==k)
        {
            pre.next  =tem.next;
            tem.next = null;
        }
    }
    public static void Todisplay()
    {
        Node tem  =head;
        while(tem!=null)
        {
            System.out.print(tem.data+" ");
            tem=tem.next;
        }
    }
    public static void Toinsert(int val)
    {
        Node newnode = new Node(val);
        if(head == null)
        {
            head  =newnode;
           
            return;
        }
        Node tem =head;
        while(tem.next!=null)
        {
            tem=tem.next; 
        }
        tem.next  =newnode;
        
        
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
            
        }
        int k = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            Toinsert(arr[i]);
        }
        Todelete(k);
        if(c==0)Todisplay();
        
        
    }
}