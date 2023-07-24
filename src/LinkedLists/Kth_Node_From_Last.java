package LinkedLists;

public class Kth_Node_From_Last {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addAtLast(10);
        ll.addAtLast(20);
        ll.addAtLast(30);
        ll.addAtLast(40);
        ll.addAtLast(50);
        ll.display();
        System.out.println(ll.size);
        System.out.println(ll.nodeFromLast(1));
    }
}
