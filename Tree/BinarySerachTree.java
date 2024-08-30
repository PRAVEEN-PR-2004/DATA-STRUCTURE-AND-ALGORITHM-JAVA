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
    public static void main(String[] args) {
        BinarySerachTree bst = new BinarySerachTree(10);
    }
    
}
