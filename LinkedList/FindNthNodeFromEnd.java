package LinkedList;

public class FindNthNodeFromEnd {
 class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class NthFromEnd {

    static void findNthFromEnd(Node head, int n) {

        if (head == null) return;

        Node fast = head;
        Node slow = head;

        // move fast n steps ahead
        for (int i = 0; i < n; i++) {
            if (fast == null) return; // n > length
            fast = fast.next;
        }

        // move both pointers
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        System.out.println("Nth from end: " + slow.data);
    }

    public static void main(String[] args) {

        Node a = new Node(10);
        a.next = new Node(20);
        a.next.next = new Node(30);
        a.next.next.next = new Node(40);
        a.next.next.next.next = new Node(50);

        findNthFromEnd(a, 2);  // Output: 40
    }
}
   
}
