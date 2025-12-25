package LinkedList.DoubleLinkedList;

public class InsertAtAnyIndex {

    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    // insert at head
    public static Node insertAtHead(Node head, int val) {
        Node temp = new Node(val);
        temp.next = head;
        head.prev = temp;
        return temp;
    }

    // insert at tail
    public static Node insertAtTail(Node tail, int val) {
        Node temp = new Node(val);
        tail.next = temp;
        temp.prev = tail;
        return temp;
    }

    // insert at any index
    public static Node insertAtIndex(Node head, Node tail, int index, int val) {

        // index 0 → head insertion
        if (index == 0) {
            head = insertAtHead(head, val);
            return head;
        }

        // index at last → tail insertion
        int size = 0;
        Node t = head;
        while (t != null) {
            size++;
            t = t.next;
        }

        if (index == size) {
            insertAtTail(tail, val);
            return head;
        }

        // middle insertion
        Node temp = new Node(val);
        Node t = head;

        for (int i = 1; i < index; i++) {
            t = t.next;
        }

        temp.next = t.next;
        temp.prev = t;
        t.next.prev = temp;
        t.next = temp;

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

        // insert at index 2
        head = insertAtIndex(head, tail, 2, 99);

        display(head);
    }
}
