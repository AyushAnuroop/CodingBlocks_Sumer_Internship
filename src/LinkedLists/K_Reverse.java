package LinkedLists;

public class K_Reverse {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addAtFirst(10);
        ll.addAtFirst(20);
        ll.addAtFirst(30);
        ll.addAtFirst(40);
        ll.addAtFirst(50);
        ll.addAtFirst(60);
        ll.addAtFirst(70);
        ll.addAtFirst(80);
        ll.addAtFirst(90);
        ll.addAtFirst(100);
        ll.addAtFirst(110);
        ll.display();
        ll.kReverse(ll.size);
        ll.display();
    }

}
