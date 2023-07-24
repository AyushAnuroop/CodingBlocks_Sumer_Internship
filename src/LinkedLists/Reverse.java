package LinkedLists;
//
//class Node{
//    Node next;
//    int val;
//    public Node(){
//        this.next=null;      //optional because by default next will be null.
//    }
//    public Node(int val){
//        this.val = val;
//        this.next=null;      //optional because by default next will be null.
//    }
//    Node head=null;
//    Node tail=null;
//    int size;
//
//    public void addAtFirst(int value){
//        Node nn = new Node(value);
//        if(size==0) {
//            head=nn;
//            tail=nn;
//        }
//        else {
//            nn.next = head;
//            head = nn;
//        }
//        size++;
//    }
//    public void display() {
//        Node curr  = head ;
//        while(curr!=null){
//            System.out.print(curr.val+" ");
//            curr=curr.next;
//        }
//        System.out.println();
//    }
//
//    public void reverse() {
//        Node curr = head;
//        Node prev=null;
//
//        while(curr !=null){
//            Node ahead = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = ahead;
//        }
//        Node temp = head;
//        head = tail;
//        tail = temp;
//    }
//
//}
//
//
public class Reverse {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addAtFirst(10);
        ll.addAtFirst(20);
        ll.addAtFirst(30);
        ll.addAtFirst(40);
        ll.display();
        ll.reverse();
        ll.display();
    }
}
