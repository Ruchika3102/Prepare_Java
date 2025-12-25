import java.util.Stack;

public class InserAtBottom {
    public static void main(String [] args){

        Stack<Integer> st=new Stack<>();
        
        st.push(1);
        st.push(2);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);

        System.out.println("The Stack is: "+st);
        System.out.println();

        Stack <Integer> stt=new Stack<>();
        while(st.size()>0){
            stt.push(st.pop());
        }
        st.push(5);
        while(stt.size()>0){
            st.push(stt.pop());
        }

        System.out.println("The new stack formed after copy the elements is: "+st);
    }
}


//at any index
//like we have to insert element at index 2 then code is

import java.util.Stack;

public class InserAtBottom {
    public static void main(String [] args){

        Stack<Integer> st=new Stack<>();
        
        st.push(1);
        st.push(2);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);

        System.out.println("The Stack is: "+st);
        System.out.println();

        Stack <Integer> stt=new Stack<>();
        while(st.size()>2){
            stt.push(st.pop());
        }
        st.push(5);
        while(stt.size()>0){
            st.push(stt.pop());
        }

        System.out.println("The new stack formed after copy the elements is: "+st); 
    }
}

