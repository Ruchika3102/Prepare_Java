package LinkedList.DoubleLinkedList;

public class PrintListFromRandomNode {
     public static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data=data;
        }
    }

    public static void display(Node random){
        Node temp=random;
        while(temp.prev!=null){
            temp=temp.prev;
        }
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String [] args){
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
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


        display(c);
    }
}
