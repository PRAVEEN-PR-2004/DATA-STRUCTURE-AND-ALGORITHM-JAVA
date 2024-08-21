package portal;
import java.util.*;


class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}

public class Loop {
    static Node head;

    public static void loop() {
        if (head == null || head.next == null) {
            System.out.print("NO LOOP");
            return;
        }
        Node tem = head;
        Set<Integer> al  =new HashSet<>();
        while(tem!=null)
        {
            if(al.contains(tem.data))
            {
                System.out.print("LOOP");
                return;
            }
            al.add(tem.data);
            tem = tem.next;
            
        }
        System.out.print("NO LOOP");
    }

    public static void Toinsert(int val) {
        Node newnode = new Node(val);
        if (head == null) {
            head = newnode;
            return;
        }
        Node tem = head;
        while (tem.next != null) {
            tem = tem.next;
        }
        tem.next = newnode;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            Toinsert(arr[i]);
        }

        // Optional: Create a loop for testing
        // head.next.next.next = head;

        loop();
    }
}
