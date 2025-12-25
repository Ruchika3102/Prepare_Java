package LinkedList.DoubleLinkedList;

public class InsertionAtHead {
    public static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data=data;
        }
    }
    public static Node insertAtStarting(Node head,int val){
        Node temp=new Node(val);
        temp.next=head;
        head.prev=temp;
        head=temp;
        return head;
    }
    public static void display(Node head){
         Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);

        a.prev=null;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=f;
        f.prev=e;
        f.next=null;

        Node newhead=insertAtStarting(a, 7);
        display(newhead);
    }
}
