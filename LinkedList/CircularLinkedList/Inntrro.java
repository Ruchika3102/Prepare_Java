//two types of circular linket list
// singly and doubly
// bs tail null nu point nhi krda haed nu point krda so thats why it is nown as circular


//prints singly linked list
public class Inntrro{
        public static class Node{
            int data;
            Node next;

            Node(int data){
                this.data=data;
            }
        }
        public static void display(Node head){
            Node temp=head;   
            while(temp.next!=head){
                System.out.print(temp.data+" ");
                temp=temp.next; 
            }
            System.out.print(temp.data);
        }
        public static void main(String [] args){
            Node a=new Node(1);
            Node b=new Node(2);   
            Node c=new Node(3);  
            Node d=new Node(4);  
            Node e=new Node(5);  
            a.next=b;
            b.next=c;
            c.next=d;    
            d.next=e;
            e.next=a;

            display(a);
        }
    }


    // for double linked list

    public static class inntrro {

    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    public static void display(Node head) {
        Node temp = head;

        while (temp.next != head) {   // traverse till last node
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.print(temp.data);  // print last node
    }

    public static void main(String[] args) {

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);

        // forward links
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = a;

        // backward links
        a.prev = e;
        b.prev = a;
        c.prev = b;
        d.prev = c;
        e.prev = d;

        display(a);
    }
}

