//import java.util.*;
//
//class LinkedListNode {
//    int data;
//    LinkedListNode next;
//
//    public LinkedListNode(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}
//
//class LinkedList {
//    LinkedListNode head;
//
//    // Function to insert a node at the end of the linked list
//    public void insert(int data) {
//        LinkedListNode newNode = new LinkedListNode(data);
//        if (head == null) {
//            head = newNode;
//        } else {
//            LinkedListNode current = head;
//            while (current.next != null) {
//                current = current.next;
//            }
//            current.next = newNode;
//        }
//    }
//
//    // Function to delete nodes with greater value on the right side
//    public void deleteNodesWithGreaterValueOnRight() {
//        if (head == null || head.next == null) {
//            // If the list is empty or has only one node, no changes are required
//            return;
//        }
//
//        // Reverse the linked list
//        head = reverseList(head);
//
//        LinkedListNode current = head;
//        int max = current.data;
//
//        // Traverse the reversed list and delete nodes with lesser values
//        while (current != null && current.next != null) {
//            if (current.next.data < max) {
//                current.next = current.next.next;
//            } else {
//                current = current.next;
//                max = current.data;
//            }
//        }
//
//        // Reverse the list again to restore the original order
//        head = reverseList(head);
//    }
//
//    // Function to reverse a linked list
//    private LinkedListNode reverseList(LinkedListNode node) {
//        LinkedListNode prev = null;
//        LinkedListNode current = node;
//        LinkedListNode next = null;
//
//        while (current != null) {
//            next = current.next;
//            current.next = prev;
//            prev = current;
//            current = next;
//        }
//
//        return prev;
//    }
//
//    // Function to print the elements of the linked list
//    public void printList() {
//        LinkedListNode current = head;
//        while (current != null) {
//            System.out.print(current.data + " ");
//            current = current.next;
//        }
//        System.out.println();
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Read the number of nodes in the linked list
//        int N = scanner.nextInt();
//
//        // Read the elements of the linked list
//        LinkedList list = new LinkedList();
//        for (int i = 0; i < N; i++) {
//            int data = scanner.nextInt();
//            list.insert(data);
//        }
//
//        // Delete nodes with greater value on the right side
//        list.deleteNodesWithGreaterValueOnRight();
//
//        // Print the modified linked list
//        list.printList();
//    }
//}