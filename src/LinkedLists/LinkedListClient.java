package LinkedLists;
public class LinkedListClient {
    public static void main(String[] args) throws Exception {

        LinkedList LL = new LinkedList();
        LL.addAtFirst(10);
        LL.addAtFirst(20);
        LL.addAtFirst(30);
        LL.addAtFirst(40);
        LL.display();
//        System.out.println(LL.deleteAtFirst());
        System.out.println(LL.deleteAtLast());
        LL.display();
        System.out.println(LL.size);
    }
}
