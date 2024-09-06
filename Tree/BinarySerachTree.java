class Node{
    int key;
    Node left;
    Node right;
    Node(int val)
    {
        key=val;
        left=right=null;
    }
}


public class BinarySerachTree {
    Node root;
    BinarySerachTree(int val)
    {
        root = new Node(val);
    }
    public static Node insert(Node root,int val)
    {
        if(root==null)
        {
            return new Node(val);
        }
        if(root.key<val)
        {
           root.right =  insert(root.right,val);
        }
        else
        {
            root.left = insert(root.left, val);
        }
        return root;
    }
    public static void Inorder(Node root)
    {
        if(root!=null)
        {
            Inorder(root.left);
            System.out.print(root.key+" ");
            Inorder(root.right);
        }
    }
    public static Node search(Node root,int val)
    {
        if(root==null || root.key == val)
        {
            return root;
        }
        if(val<root.key)
        {
            return search(root.left,val);
        }
        else
        {
           return search(root.right, val);
        }
        
    }
    public static Node delete(Node root,int val)
    {
        if(root==null)
        {
            return root;
        }
        if(root.key<val)
        {
            root.right= delete(root.right, val);
        }
        else if(root.key>val)
        {
            root.left=delete(root.left,val);
        }
        else
        {
            if(root.right==null)
            {
                return root.left;
            }
            else if(root.left==null)
            {

                return root.right;
            }
            root.key = min(root.right);
            root.right = delete(root.right, root.key);
        }
        return root;
    }
    public static int min(Node root)
    {
        int minval = root.key;
        while(root.left!=null)
        {
            minval = root.left.key;
            root = root.left;
        }
        return minval;
    }
    public static void main(String[] args) {
        BinarySerachTree bst = new BinarySerachTree(20);
        insert(bst.root, 70);
        insert(bst.root, 10);
        insert(bst.root, 25);
        insert(bst.root, 60);
        insert(bst.root, 90);
        if(search(bst.root,61)==null)
        {
            System.out.println("not found");
        }
        else
        {
            System.out.println("found");
        }
        delete(bst.root,25);
        Inorder(bst.root);
        

    }
    
}
