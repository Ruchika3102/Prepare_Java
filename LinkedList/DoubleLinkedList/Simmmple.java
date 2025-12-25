package LinkedList.DoubleLinkedList;
// previous ki data null hoti hai and next ki address null hoti hai
//it takes more memory then singly
//by storing XOR addresses of previos and next node we create a doubly linked list using one pointer with every node 
public class Simmmple {
    public static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data=data;
        }
    }

    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String [] args){
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new N0de(4);
        Node e=new Node(5);

        a.prev=null;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=null;

        display(a);
    }
}
