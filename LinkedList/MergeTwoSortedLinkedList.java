package LinkedList;

public class MergeTwoSortedLinkedList {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    static Node merge(Node a, Node b) {

        if (a == null) return b;
        if (b == null) return a;

        if (a.data < b.data) {
            a.next = merge(a.next, b);
            return a;
        } else {
            b.next = merge(a, b.next);
            return b;
        }
    }

    static void display(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {

        // List 1: 1 3 5
        Node a = new Node(1);
        a.next = new Node(3);
        a.next.next = new Node(5);

        // List 2: 2 4 6
        Node b = new Node(2);
        b.next = new Node(4);
        b.next.next = new Node(6);

        Node head = merge(a, b);
        display(head);
    }
}