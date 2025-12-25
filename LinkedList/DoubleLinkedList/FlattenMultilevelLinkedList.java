package LinkedList.DoubleLinkedList;

public class FlattenMultilevelLinkedList {
     public static Node flatten(Node head) {
        dfs(head);
        return head;
    }

    // returns tail of flattened list
    private static Node dfs(Node curr) {

        Node temp = curr;
        Node last = null;

        while (temp != null) {

            Node next = temp.next;

            // if child exists
            if (temp.child != null) {

                Node childHead = temp.child;
                Node childTail = dfs(childHead);

                // connect temp with child
                temp.next = childHead;
                childHead.prev = temp;

                // connect child tail with next
                if (next != null) {
                    childTail.next = next;
                    next.prev = childTail;
                }

                temp.child = null; // remove child link
                last = childTail;
            } else {
                last = temp;
            }

            temp = next;
        }
        return last;
    }
}
