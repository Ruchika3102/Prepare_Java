package LinkedList;
//if only head is given then time complexity is O(n)
//this is example of only head is given
public class FindLength {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }
    public static int length(Node head){
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public static void main(String [] args){
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=null;
        int z=length(a);
        System.out.print(z);
    }
}

//in case of linkedList class time complexity=O(1)
//this is the example of that here we do not make size funcion we initialise in starting and increment when we add element 
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
        int size=0;
        void insertAtBegining(int val){
            Node temp=new Node(val);
            if(head==null){
                tail=temp;
            }
            else{
                temp.next=head;
            }
            head=temp;
            size++;
        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
        int size(){
            return size;
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

