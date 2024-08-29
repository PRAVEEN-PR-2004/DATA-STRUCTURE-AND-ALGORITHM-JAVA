
class Node{
    int data;
    Node left,right;
    Node(int d)
    {
        data = d;
        left=null;
        right = null;

    }
}


public class BinaryTree {
    Node root;
    BinaryTree(int r)
    {
        root = new Node(r);
    }
    public static void InsertAtRight(Node r,int data)
    {
        Node newnode = new Node(data);
        r.right = newnode;
    }
    public static void InsertAtLeft(Node r,int data)
    {
        Node newnode = new Node(data);
        r.left = newnode;
    }
    public static void Inorder(Node root)
    {
        if(root!=null)
        {
            Inorder(root.left);
            System.out.print(root.data+" ");
            Inorder(root.right);

        }
    }
    public static void Preorder(Node root)
    {
        if(root!=null)
        {
            System.out.print(root.data+" ");
            Preorder(root.left);
            Preorder(root.right);

        }
        
    }
    public static void Postorder(Node root)
    {
        if(root!=null)
        {
            Postorder(root.left);
            Postorder(root.right);
            System.out.print(root.data+" ");

        }
    }
    public static void main(String[] args)
    {
        BinaryTree bt = new BinaryTree(10);
        InsertAtRight(bt.root,15);
        InsertAtLeft(bt.root.right,12);
        InsertAtLeft(bt.root, 5);
        InsertAtLeft(bt.root.left, 3);
        InsertAtRight(bt.root.left, 8);
        Preorder(bt.root);
        System.out.println();
        Inorder(bt.root);
        System.out.println();
        Postorder(bt.root);
        System.out.println();
        


    }

}
