//jive arrayList ch elements add krde c ove hi appa linkedList ch last th ellemnet add krna chahnde aw jo rail bnje and usch null hove addresss di jgah like mai likha ll.add(5) this insert at last
//time complexity=O(1)
//if tail is given =O(1)
//if head is given =O(n)
package LinkedList;

public class InsertElementAtLAst {
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

public static void display(){
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
    }
}
public int size(){
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
        linkedList ll=new linkedList();      //agar appa koi element insert krna tah eve arraylist vangu hi hoyu
        ll.InsertAtEnd(1);
        ll.InsertAtEnd(2);
        ll.InsertAtEnd(3);
        ll.display();

        int z=ll.size();
        System.out.println();
        System.out.println("The size of this list: "+z);
        System.out.println("The head is: "+ll.head.data);
        System.out.println("The tail is: "+ll.tail.data);
    }
}





