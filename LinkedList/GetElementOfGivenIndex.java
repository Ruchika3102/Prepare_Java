package LinkedList;
//time complexity=O(n)

public class GetElementOfGivenIndex {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

    public static class linkedList{
        static Node head;
        static Node tail;

        int getElementAtIndex(int index){
            Node temp=head;
            if(index<0 || index>=size()){
                System.out.println("Invalid index");
                return -1;
            }
            for(int i=0;i<index;i++){
                temp=temp.next;
            }
            return temp.data;
        }
    }

    public static void main(String[] args){
        linkedList ll=new linkedList();
        ll.head=new Node(10);
        ll.head.next=new Node(20);
        ll.head.next.next=new Node(30);
        ll.head.next.next.next=new Node(40);
        ll.tail=ll.head.next.next.next;

        int indexToGet=2;
        int element=ll.getElementAtIndex(indexToGet);
            System.out.println(element);
    }
}
