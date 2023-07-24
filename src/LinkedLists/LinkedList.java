package LinkedLists;
class LinkedList {
    class Node{
        Node next;
        int val;

        public Node(){
            this.next=null;      //optional because by default next will be null.
        }
        public Node(int val){
            this.val = val;
            this.next=null;      //optional because by default next will be null.
        }
    }
    Node head;
    Node tail;
    public int size;

    public void addAtFirst(int value){
        Node nn = new Node(value);
        if(size==0) {
            head=nn;
            tail=nn;
        }
        else {
            nn.next = head;
            head = nn;
        }
        size++;
    }
    public void display() {
        Node curr  = head ;
        while(curr!=null){
            System.out.print(curr.val+" ");
            curr=curr.next;
        }
        System.out.println();
    }

    public void addAtLast(int value){
        Node nn = new Node(value);
        if(size==0) {
            addAtFirst(value);
        }
        else{
            tail.next=nn;
            tail=nn;
            size++;
        }
    }

    public int getAtIndex(int index) throws Exception{
        Node curr = head;
        if(index<0 || index>size) {
            throw new Exception("Invalid Index");
        }
        if(size==0){
            throw new Exception("Linked List is Empty");
        }
        for(int i=1 ; i<=index ; i++){
            curr=curr.next;
        }
        return curr.val;
    }

    public Node getNodeAtIndex(int index) throws Exception{
        Node curr = head;
        if(index<0 || index>size) {
            throw new Exception("Invalid Index");
        }
        if(size==0){
            throw new Exception("Linked List is Empty");
        }
        for(int i=1 ; i<=index ; i++){
            curr=curr.next;
        }
        return curr;
    }

    public void addAtIndex(int index, int val) throws Exception {
        Node nn = new Node(val);
        Node prev = getNodeAtIndex(index-1);
        Node prevNext = prev.next;
        prev.next = nn;
        nn.next = prevNext;
    }

    public int getFirstNodeValue() throws Exception {
        if(size==0){
            throw new Exception("Linked List is Empty");
        }
        return head.val;
    }
    public int getLastNodeValue() throws Exception {
        if(size==0){
            throw new Exception("Linked List is Empty");
        }
        return head.val;
    }

    public int deleteAtFirst() throws Exception {
        if(size==0){
            throw new Exception("Linked List is Empty");
        }

        if (size==1){
            tail=null;
        }
        Node curr = head;
        head = head.next;
        curr.next=null;
        size--;
        return curr.val;
    }

    public int deleteAtLast() throws Exception {
        if(size==0){
            throw new Exception("Linked List is Empty");
        }

        if (size==1){
            tail=null;
        }
        Node curr=head;
        while (curr.next.next!=null){
            curr=curr.next;
        }
        Node last = curr.next;
        curr.next=null;
        size--;
        return last.val;
    }

//    Reverse a Linked List
    public void reverse() {
        Node curr = head;
        Node prev=null;

        while(curr !=null){
            Node ahead = curr.next;
            curr.next = prev;
            prev = curr;
            curr = ahead;
        }
        Node temp = head;
        head = tail;
        tail = temp;
    }
//    K Reverse
    public void kReverse(int k){
        Node curr=head,prevFirst=null;
        boolean isFirstPass=true;
        while (curr!=null){
            Node first = curr;
            Node prev = null;
            int count=0;
            while (curr != null && count<k) {
                Node ahead = curr.next;
                curr.next = prev;
                prev = curr;
                curr = ahead;
                count++;
            }
            if(isFirstPass){
                head = prev;
                isFirstPass=false;
            }
            else{
                prevFirst.next=prev;
            }
            prevFirst=first;
//            Node temp = head;
//            head = tail;
//            tail = temp;
        }
    }
//    Get Kth Node from Last
    public int nodeFromLast(int k){
        if(k>size){
            return -1;
        }
        Node left = head;
        Node right = head;
        while(k!=1){
            right=right.next;
            k--;
        }

        while(right.next!=null){
            left=left.next;
            right=right.next;
        }

        return left.val;
    }

//    Delete LL
    public void deleteAtNode(Node curr){
        curr.val =curr.next.val;
        curr.next=curr.next.next;
    }

    public void deleteLL(){
        Node first = head;
        Node second = head.next;
        while(second!=null){
            if(first.val<second.val){
                deleteAtNode(first);
            }
            first=second;
            second=second.next;
        }
    }
}

