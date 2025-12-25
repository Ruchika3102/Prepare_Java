import java.util.*;
public class Simmplle {
    public static void main(String[] args){
        Stack<Integer> st= new Stack<>();
       System.out.println("the size of stack before push elements is: "+st.size());
        System.out.println("The stack before push elements is: "+st);
        System.out.println(st.isEmpty());
        System.out.println();
        
        st.push(1);
        st.push(2);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);
        
        System.out.println("The Stack is: "+st);
        System.out.println("The Topmost Element is: "+st.peek());
        System.out.println("The Size of Stack is: "+st.size());
        System.out.println(st.isEmpty());
        System.out.println();
        
        st.pop();
        
        System.out.println("The Stack is: "+st);
        System.out.println("The Topmost Element is: "+st.peek());
        System.out.println("The Size of Stack is: "+st.size());
        System.out.println();
        
        st.pop();
        
        System.out.println("The Stack is: "+st);
        System.out.println("The Topmost Element is: "+st.peek());
        System.out.println("The Size of Stack is: "+st.size());
        
    }
}



//with user input elements;
import java.util.*;
public class Simmplle{
    public static void main(String[] args) {
        Stack <integer> st=new Stack<>();

        Scanner sc=new Scanner(System.in);
            System.out.println("ENter no of elements");
            int n=sc.nextInt();
            System.out.println("Enter elements");

            for(int i=0;i<n;i++){
                int x=sc.nextInt();
                st.push(x);
            }
            System.out.print("The stack is: "+st);
    } 
}



//jh appa same stack ch hi reverse order ch pana then 2 new stack hor lgange jive uppr paya usch v 2 lge stack new bs isch stt to chk k st ch v pana reverse ch ho jaan gh elements