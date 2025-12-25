package LinkedList;
//time complexity=O(n) and space complexity =O(1)
public class InsertElementAtGivenIndex {
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

        void insertAtIndex(int val,int index){
            Node temp=new Node(val);
            Node t=head;
            for(int i=1;i<=index-1;i++){
                t=t.next;
            }
            temp.next=t.next;   //phla join krange agle nal bond
            t.next=temp;         //then todange
        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
        void size(){
            Node temp=head;
            int count=0;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            System.out.println("Size: "+count);
        }
    }
    public static void main(String[] args){
        linkedList ll=new linkedList();
        ll.head=new Node(1);
        ll.head.next=new Node(2);
        ll.head.next.next=new Node(3);
        ll.head.next.next.next=new Node(4);
        ll.head.next.next.next.next=new Node(5);
        ll.tail=ll.head.next.next.next.next;
        ll.insertAtIndex(5,3);
        ll.display();
        System.out.println();
        ll.size();

        System.out.println("Head: "+ll.head.data);
        System.out.println("Tail: "+ll.tail.data);

    }
}

// if we give index 0 or index last so this code will not work properly because we have not handled those cases

//corrected code for these cases and also use insert at begining and insert at last
public class InsertElementAtGivenIndex {
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

        void insertAtIndex(int val,int index){
            Node temp=new Node(val);
            Node t=head;
            if(index==0){
                insertAtBegining(val);
                return;
            }
            if(index==size()){
                InsertAtEnd(val);
                return;
            }
            if(idx<0 || idx>size()){
                System.out.println("Invalid index");
                return;
            }
            for(int i=1;i<=index-1;i++){
                t=t.next;
            }
            temp.next=t.next;
            t.next=temp;
        }
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
        void InsertAtEnd(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;
            }
            else{
                tail.next=temp;
            }
            tail=temp;
            }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
        void size(){
            Node temp=head;
            int count=0;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            System.out.println("Size: "+count);
        }
    }
    public static void main(String[] args){
        linkedList ll=new linkedList();
        ll.InsertAtEnd(1);
        ll.InsertAtEnd(2);
        ll.InsertAtEnd(3);
        ll.insertAtBegining(6);
        ll.insertAtBegining(9);
        ll.insertAtBegining(7);
        ll.insertAtIndex(5,3);
        ll.insertAtIndex(8,0); // inserting at begining using insertAtIndex
        ll.InsertAtEnd(10); // inserting at last using insertAtIndex
        ll.display();
        System.out.println();
        ll.size();

        System.out.println("Head: "+ll.head.data);
        System.out.println("Tail: "+ll.tail.data);

    }
}
