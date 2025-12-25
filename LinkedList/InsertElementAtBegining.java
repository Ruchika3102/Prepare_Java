//time complexity=O(1)
public class InsertElementAtBegining {
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
        void insertAtBegining(int val){
            Node temp=new Node(val);
            if(head==null){
                tail=temp;
            }
            else{
                temp.next=head;
            }
            head=temp;
        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
        int size(){
            Node temp=head;
            int count=0;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }
    }
    public static void main(String args[]){
        linkedList ll=new linkedList();
        ll.insertAtBegining(1);
        ll.insertAtBegining(2);
        ll.insertAtBegining(3);
        ll.display();

        int z=ll.size();
        System.out.println();
        System.out.println("The size of this list: "+z);
        System.out.println("the head is: "+ll.head.data);
        System.out.println("the tail is: "+ll.tail.data);
    }
}
