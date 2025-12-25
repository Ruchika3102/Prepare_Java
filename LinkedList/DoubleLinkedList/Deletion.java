package LinkedList.DoubleLinkedList;

public class Deletion {
     public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    // delete at head
    public static Node deleteAtHead(Node head) {
        if (head == null || head.next == null) return null;
        head = head.next;
        head.prev = null;
        return head;
    }

    // delete at tail
    public static Node deleteAtTail(Node tail) {
        if (tail == null || tail.prev == null) return null;
        tail = tail.prev;
        tail.next = null;
        return tail;
    }

    // delete at any index
    public static Node deleteAtIndex(Node head, Node tail, int index) {

        if (head == null) return null;

        // index 0 → delete head
        if (index == 0) {
            return deleteAtHead(head);
        }

        // find size
        int size = 0;
        Node t = head;
        while (t != null) {
            size++;
            t = t.next;
        }

        // last index → delete tail
        if (index == size - 1) {
            deleteAtTail(tail);
            return head;
        }

        // middle deletion
        Node t = head;
        for (int i = 0; i < index; i++) {
            t = t.next;
        }

        t.prev.next = t.next;
        t.next.prev = t.prev;

        return head;
    }

    // display list
    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);

        a.next = b;
        b.prev = a;

        b.next = c;
        c.prev = b;

        c.next = d;
        d.prev = c;

        Node head = a;
        Node tail = d;

        // delete at index 2
        head = deleteAtIndex(head, tail, 2);

        display(head);
    }
}
