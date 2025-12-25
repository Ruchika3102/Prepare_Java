package LinkedList;

public class FindMaxMinSmaxSminNode {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static void find(Node head) {

        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;

        Node temp = head;

        while (temp != null) {

            int x = temp.data;

            // for max and smax
            if (x > max) {
                smax = max;
                max = x;
            } else if (x > smax && x != max) {
                smax = x;
            }

            // for min and smin
            if (x < min) {
                smin = min;
                min = x;
            } else if (x < smin && x != min) {
                smin = x;
            }

            temp = temp.next;
        }

        System.out.println("Max = " + max);
        System.out.println("Second Max = " + smax);
        System.out.println("Min = " + min);
        System.out.println("Second Min = " + smin);
    }

    public static void main(String[] args) {

        Node head = new Node(5);
        head.next = new Node(2);
        head.next.next = new Node(9);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(7);

        find(head);
    }
}
