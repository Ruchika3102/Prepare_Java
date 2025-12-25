package LinkedList;

public class DeleteElemnetAtGivenIndex {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class linkedList {
        static Node head;
        static Node tail;

        // 🔴 DELETE AT GIVEN INDEX
        void deleteAtIndex(int index) {

            if (head == null) {
                System.out.println("List is empty");
                return;
            }

            // delete at start
            if (index == 0) {
                head = head.next;
                if (head == null)
                    tail = null;

                printStatus("After deleting at index " + index);
                return;
            }

            Node t = head;

            for (int i = 1; i < index && t.next != null; i++) {
                t = t.next;
            }

            if (t.next == null) {
                System.out.println("Invalid index");
                return;
            }

            // delete node
            t.next = t.next.next;

            // update tail if last node deleted
            if (t.next == null) {
                tail = t;
            }

            printStatus("After deleting at index " + index);
        }

        // 🔹 DISPLAY LIST
        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        // 🔹 SIZE
        int size() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

        // 🔹 PRINT EVERYTHING
        void printStatus(String msg) {
            System.out.println("\n" + msg);
            System.out.print("List: ");
            display();
            System.out.println("Size: " + size());
            System.out.println("Head: " + (head != null ? head.data : "null"));
            System.out.println("Tail: " + (tail != null ? tail.data : "null"));
        }
    }

    public static void main(String[] args) {

        linkedList ll = new linkedList();

        ll.head = new Node(1);
        ll.head.next = new Node(2);
        ll.head.next.next = new Node(3);
        ll.head.next.next.next = new Node(4);
        ll.head.next.next.next.next = new Node(5);

        ll.tail = ll.head.next.next.next.next;

        ll.printStatus("Initial List");

        ll.deleteAtIndex(0);  // delete from start
        ll.deleteAtIndex(2);  // delete from between
        ll.deleteAtIndex(1);  // delete from end
    }
}
