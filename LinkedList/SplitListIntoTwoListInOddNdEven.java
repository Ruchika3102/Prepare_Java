package LinkedList;

public class SplitListIntoTwoListInOddNdEven {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to split list
    static void splitOddEven(Node head) {

        Node oddHead = null, oddTail = null;
        Node evenHead = null, evenTail = null;

        Node temp = head;

        while (temp != null) {

            if (temp.data % 2 == 0) {   // EVEN
                if (evenHead == null) {
                    evenHead = evenTail = temp;
                } else {
                    evenTail.next = temp;
                    evenTail = temp;
                }
            } else {                    // ODD
                if (oddHead == null) {
                    oddHead = oddTail = temp;
                } else {
                    oddTail.next = temp;
                    oddTail = temp;
                }
            }
            temp = temp.next;
        }

        if (oddTail != null) oddTail.next = null;
        if (evenTail != null) evenTail.next = null;

        System.out.print("Odd List: ");
        display(oddHead);

        System.out.print("Even List: ");
        display(evenHead);
    }

    // Display list
    static void display(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        splitOddEven(head);
    }
}
