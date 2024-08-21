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
public class MiddleList
{
    static Node head;
    public static int c=0;
    public static void Toprintmiddle(int middle)
    {
        Node tem = head;
        int index = 0;
        while(index!=middle)
        {
            tem=tem.next;
            index++;
        }
        System.out.print(tem.data);
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
        
        for(int i=0;i<n;i++)
        {
            Toinsert(arr[i]);
        }
        int m = n/2;
        Toprintmiddle(m);
        
        
        
        
        
    }
}