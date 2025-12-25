package LinkedList.DoubleLinkedList;

public class CriticalPointMaxAndMinDistance {
    class Node {
    int val;
    Node next;
    Node prev;

    Node(int val) {
        this.val = val;
    }
}

public class CriticalPointDLL {

    static void criticalPoints(Node head) {

        if (head == null || head.next == null || head.next.next == null) {
            System.out.println("Not enough nodes");
            return;
        }

        int index = 1;              // position counter
        int first = -1;             // first critical point index
        int last = -1;              // last critical point index
        int minDist = Integer.MAX_VALUE;

        Node t = head.next;         // skip first node

        while (t.next != null) {    // skip last node

            // local maxima
            if (t.val > t.prev.val && t.val > t.next.val ||
                // local minima
                t.val < t.prev.val && t.val < t.next.val) {

                if (first == -1) {
                    first = index;
                } else {
                    minDist = Math.min(minDist, index - last);
                }
                last = index;
            }
            index++;
            t = t.next;
        }

        if (first == last) {
            System.out.println("[-1, -1]");
        } else {
            int maxDist = last - first;
            System.out.println("Min Distance = " + minDist);
            System.out.println("Max Distance = " + maxDist);
        }
    }

    public static void main(String[] args) {

        // Example from image:
        // 1 <-> 2 <-> 5 <-> 3 <-> 2 <-> 7 <-> 8 <-> 9 <-> 1 <-> 10

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(5);
        Node d = new Node(3);
        Node e = new Node(2);
        Node f = new Node(7);
        Node g = new Node(8);
        Node h = new Node(9);
        Node i = new Node(1);
        Node j = new Node(10);

        a.next = b; b.prev = a;
        b.next = c; c.prev = b;
        c.next = d; d.prev = c;
        d.next = e; e.prev = d;
        e.next = f; f.prev = e;
        f.next = g; g.prev = f;
        g.next = h; h.prev = g;
        h.next = i; i.prev = h;
        i.next = j; j.prev = i;

        criticalPoints(a);
    }
}

}
