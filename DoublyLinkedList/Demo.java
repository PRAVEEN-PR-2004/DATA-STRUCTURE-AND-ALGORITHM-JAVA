package DoublyLinkedList;

public class Demo {
    public static void main(String[] args) {
       
        DoublyLinkedList dlist = new DoublyLinkedList();
        dlist.insertAtBeginning(10);
        dlist.insertAtBeginning(20);
        dlist.insertAtBeginning(40);
        dlist.insertAtBeginning(50);
        //dlist.insertAtNormal(0);
       
       dlist.delete(3);
        dlist.display();
         System.out.println();
         dlist.revdisplay();
    }
}
