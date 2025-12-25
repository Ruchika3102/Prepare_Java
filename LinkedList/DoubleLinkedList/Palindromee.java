package LinkedList.DoubleLinkedList;

public class Palindromee {
    class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
    }
}

public class PalindromeDLL {

    static boolean isPalindrome(Node head) {

        if (head == null)
            return true;

        // find tail
        Node left = head;
        Node right = head;
        while (right.next != null) {
            right = right.next;
        }

        // compare from both ends
        while (left != right && left.prev != right) {
            if (left.data != right.data)
                return false;

            left = left.next;
            right = right.prev;
        }
        return true;
    }

    public static void main(String[] args) {

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(2);
        Node d = new Node(1);

        a.next = b;
        b.prev = a;

        b.next = c;
        c.prev = b;

        c.next = d;
        d.prev = c;

        System.out.println(isPalindrome(a)); // true
    }
}

}
