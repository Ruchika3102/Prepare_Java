//non contiguous memory location
//dynamic size
//we formed Nodes that contains data and address of next node
// Node  has two parts
//jihne elements hunde aw ohne Nodes bnde aw then ik Nodech 2 box hunde aw first box storr element and second box store address of next node
//last Node ch kise cheeej da adress nhi store hunda address di jgah null store hunda
//first Node is known as head and last Node is known as tail
//Node sare ik dooje nal link hunde aw
//jo element hunda Node ch usdi apni datatype hundi aw kujj pr add di datatype Node di data type hundi aw
// this is singly listed list
package LinkedList;

public class Inntroduction {
    public static class Node{    //syntax id same as of OOPS bs oops ch appa koi name rkhde aw class da pr LinkedList ch Node rkhna penda aw
        int data;//value store krn layi
        Node next;//address of next node store krn layi

     Node(int data){   //contructor class de andar bnda
        this.data=data;
    }
}
    public static void main(String args[]){
     Node a=new Node(1);
     System.out.println(a.next);  //prints null becuase Node da sond dabba hunda .next so oh hje link hi nhi kita kise nal so null show kru
     Node b=new Node(2);  
     Node c=new Node(3);  
     Node d=new Node(4);  
     Node e=new Node(5);  
    a.next=b;//linking nodes
    System.out.println(a);  //prints addres of a
    System.out.println(a.next); //prints address of b beacuse link krta eh b nal a.next=b is line nal
    System.out.println(b); //prints address of b
    System.out.println(b.data); //prints data of b
    System.out.println(a.next.data); //prints data of b beacuse a.next is b so a.next.data is b.data
    b.next=c;
    System.out.println(a.next.next.data); //prints data of c beacuse a.next is b and b.next is c so a.next.next is c so a.next.next.data is c.data
    c.next=d;
    d.next=e;
    e.next=null;//last node
    }
}



//insertion krna bhut sokha linked list ch 
//jive ppa 2nd index th 10  add krna chahnde aw tah  10 da ik ad Node bnado th uscg 3rd elemt da address pado and 1st index vale Node ch oh 10 vale Node da address pado 
//koi element get krna tah O(n) time lagda aw linked list ch 



//Display a linked list
public static class Inntroduction{
    public static class Node{
        int data;
        Node next;

     Node(int data){
        this.data=data;
    }
}
    public static void main(String args[]){
     Node a=new Node(1);
     Node b=new Node(2);  
     Node c=new Node(3);  
     Node d=new Node(4);  
     Node e=new Node(5);  
    a.next=b;
    b.next=c;
    c.next=d;
    d.next=e;
    e.next=null;

    //display linked list
    Node temp=a; //temp node bnaya jide ch head da address store krditta, isch appa new variable nhi bnaya bs ik tempt nu a assign krta jo head aw
    for(int i=1;i<=5;i++){
        System.out.print(temp.data+" ");//print krda temp ch jo v data hunda aw
        temp=temp.next;//temp ch next node da address store krditta    means pura agla Node
    }
    }
    }


    //jh size nhi dita bs head node dita so appa for loop nhi la sakde isch ch condition hundi aw ki ending point pta hona chahida so appa while loop lavange
    public class Inntroduction{
        public static class Node{
            int data;
            Node next;

            Node(int data){
                this.data=data;
            }
        }
        public static void main(String [] args){
            Node a=new Node(1);
            Node b=new Node(2);  //eh sara th likhna penda 
            Node c=new Node(3);  
            Node d=new Node(4);  
            Node e=new Node(5);  
            a.next=b;
            b.next=c;
            c.next=d;     //eh v
            d.next=e;
            e.next=null;

            Node temp=a;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }



    //with function
    public class Inntroduction{
        public static class Node{
            int data;
            Node next;

            Node(int data){
                this.data=data;
            }
        }
        public static void display(Node head){
            Node temp=head;    //uppr sare kite ethe temp is krke use krde aw kyonki oh age age shift hunda rehnda a v use kr sakde c jo head hunda pr fr oh a age age shift hoyu jayu is nal appa apna head kho dine aw so oh a head nhi rhu last tk point hoju tail bnju so head da koi naam hi nhi rhu appa head nu kive access krange
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
            a.next=b;
            b.next=c;
            c.next=d;    
            d.next=e;
            e.next=null;

            display(a);
        }
    }


