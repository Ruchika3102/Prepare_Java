package LinkedList.DoubleLinkedList;
//ehoje 2 elements jihna da sum krke k brabar hove
public class TwoSUm {
 class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
    }
}

public class TwoSumDLL {

    static void twoSum(Node head, int x) {

        if (head == null)
            return;

        // find tail
        Node left = head;
        Node right = head;
        while (right.next != null) {
            right = right.next;
        }

        // two pointer approach
        while (left != right && left.prev != right) {

            int sum = left.data + right.data;

            if (sum == x) {
                System.out.println(left.data + " " + right.data);
                left = left.next;
                right = right.prev;
            }
            else if (sum < x) {
                left = left.next;
            }
            else {
                right = right.prev;
            }
        }
    }

    public static void main(String[] args) {

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);
        Node f = new Node(8);

        a.next = b; b.prev = a;
        b.next = c; c.prev = b;
        c.next = d; d.prev = c;
        d.next = e; e.prev = d;
        e.next = f; f.prev = e;

        int x = 7;
        twoSum(a, x);
    }
}
   
}
