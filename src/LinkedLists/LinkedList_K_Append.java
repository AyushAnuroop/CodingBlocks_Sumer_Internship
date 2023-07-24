package LinkedLists;
import java.util.*;
public class LinkedList_K_Append {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }
    static Node appendLastKToFirst(Node head, int k) {
        if (head == null || k <= 0) {
            return head;
        }

        int count = 0;
        Node current = head;
        Node lastNode = null;

        // Traverse the linked list to find the last node
        while (current.next != null) {
            count++;
            current = current.next;
        }

        // If k is greater than or equal to the length of the linked list, wrap k to the actual number of elements to append
        k = k % (count + 1);

        // If k becomes 0, it means no elements need to be appended
        if (k == 0) {
            return head;
        }

        current = head;
        int stepsToMove = count - k;
        while (stepsToMove > 0) {
            stepsToMove--;
            current = current.next;
        }

        lastNode = current.next;
        current.next = null;

        current = lastNode;
        while (current.next != null) {
            current = current.next;
        }

        current.next = head;
        return lastNode;
    }


    static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Size of the linked list
        Node head = null;
        Node tail = null;

        // Build the linked list
        for (int i = 0; i < n; i++) {
            int data = scanner.nextInt();
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        int k = scanner.nextInt(); // Number of elements to append

        head = appendLastKToFirst(head, k);
        printLinkedList(head);
    }
}
