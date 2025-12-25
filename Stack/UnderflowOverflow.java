// if stack is empty st.peek() or st.pop(); shows error this is called underflow
//if stack is full so st.push shows error so this is caled overflow it happens when memory of our pc is full or happens when we implement stack using arrays eg-

public class UnderflowOverflow{
    public static class Stack{
        private int[] arr=new int[5];
        private int idx=0;
        void push(int x){
            if(isFull()){
                System.out.println("Stack is Full!");
                return;
            }
            arr[idx]=x;
            idx++;
        }
        int peek(){
            if(idx==0){
                System.out.println("Stack is Empty!");
                return -1;
            }
            return arr[idx-1];
        }
        int pop(){
            if(idx==0){
                System.out.println("Stack is Empty!");
                return -1;
            }
            int top=arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;
        }
        void display(){
            for(int i=0;i<=idx-1;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
            int size(){
                return idx;
            }
            boolean isEmpty(){
                 if(idx==0) return true;
                 else return false;
            }
            boolean isFull(){
                if(idx==arr.length) return true;
                else return false;
            }
        }
        public static void main(String[] args) {
            Stack st=new Stack();
            st.push(4);
            st.display();
            st.push(5);
            st.display();
            st.push(1);
            st.display();
            System.out.println(st.size());
            st.pop();
            st.display();
            System.out.println(st.size());
            st.push(7);
            st.push(8);
            System.out.println(st.size());
            st.push(9);
        }
    }



    //linked list implementation of stacks
    public class StackUsingLinkedList {

    // Node class
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // Stack class
    public static class Stack {
        private Node top = null;
        private int size = 0;

        // PUSH
        void push(int x) {
            Node temp = new Node(x);
            temp.next = top;
            top = temp;
            size++;
        }

        // PEEK
        int peek() {
            if (isEmpty()) {
                System.out.println("Stack is Empty!");
                return -1;
            }
            return top.data;
        }

        // POP
        int pop() {
            if (isEmpty()) {
                System.out.println("Stack is Empty!");
                return -1;
            }
            int val = top.data;
            top = top.next;
            size--;
            return val;
        }

        // DISPLAY
        void display() {
            Node temp = top;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        // SIZE
        int size() {
            return size;
        }

        // isEmpty
        boolean isEmpty() {
            return top == null;
        }
    }

    // Main method
    public static void main(String[] args) {
        Stack st = new Stack();

        st.push(4);
        st.display();

        st.push(5);
        st.display();

        st.push(1);
        st.display();

        System.out.println(st.size());

        st.pop();
        st.display();

        System.out.println(st.size());

        st.push(7);
        st.push(8);
        st.display();

        System.out.println(st.peek());
    }
}


