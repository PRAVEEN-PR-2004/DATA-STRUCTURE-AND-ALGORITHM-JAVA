import java.util.*;
class Node
{
    int val;
    Node left;
    Node right;
    Node(int data)
    {
        val = data;
        left = null;
        right = null;
    }
}
public class Bst {
    public static Node root;
    public static void insert(Node root,int val)
    {
        Node newNode = new Node(val);
        if(root==null)
        {
            root= newNode;
            return;
        }
        if(root.val>val)
        {
            root.left = insert(root.left,val);
        }



    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    }
}
