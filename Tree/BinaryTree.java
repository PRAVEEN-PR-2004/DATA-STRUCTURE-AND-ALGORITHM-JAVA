import java.util.*;

class Node {
    int val;
    Node left;
    Node right;

    Node(int v) {
        val = v;
        left = null;
        right = null;
    }
}

public class BinaryTree {

    // Method to insert a node in level order
    public static Node insert(Node root, int v) {
        Node tem = root;
        Queue<Node> store = new LinkedList<>();
        store.add(tem);

        while (!store.isEmpty()) {
            Node cur = store.poll();
            if (cur.left != null) {
                store.add(cur.left);
            } else {
                cur.left = new Node(v);
                break;
            }

            if (cur.right != null) {
                store.add(cur.right);
            } else {
                cur.right = new Node(v);
                break;
            }
        }
        return root;
    }

    // Method for level order traversal
    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> store = new LinkedList<>();
        store.add(root);

        while (!store.isEmpty()) {
            Node cur = store.poll();
            System.out.print(cur.val + " ");

            if (cur.left != null) {
                store.add(cur.left);
            }
            if (cur.right != null) {
                store.add(cur.right);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of nodes:");
        int n = sc.nextInt();

        // Create the root node
        System.out.println("Enter root value:");
        Node root = new Node(sc.nextInt());

        // Insert remaining nodes
        for (int i = 1; i < n; i++) {
            System.out.println("Enter value for node " + (i + 1) + ":");
            root = insert(root, sc.nextInt());
        }

        // Print the tree in level order
        System.out.println("Level Order Traversal:");
        levelOrder(root);
    }
}
