package LinkedList;
//head nu hi slow assign krna head nu hi fast assign krna then dona nu age leke jana fast vala phla then slow fast nu hameha ik ya 2-2 kdn pr sloew nu cndition de base th aram aram nl
public class MiddleElemnt {
    class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class MiddleOfLL {

    static void findMiddle(Node head) {

        if (head == null) return;

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println("Middle element: " + slow.data);
    }

    public static void main(String[] args) {

        Node a = new Node(1);
        a.next = new Node(2);
        a.next.next = new Node(3);
        a.next.next.next = new Node(4);
        a.next.next.next.next = new Node(5);

        findMiddle(a);
    }
}

}
