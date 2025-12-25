import java.util.*;
public class ToAccessFirstElement {
    public static void main(String [] args){

        Stack<Integer> st=new Stack<>();
        
        st.push(1);
        st.push(2);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);
        
        //to access first element
        // while(st.size()>1){
        //     st.pop();
        // }
        // System.out.println(st.peek());
        // System.out.println(st);

        //to access 2nd element
        while(st.size()>2){
            st.pop();
        }
        System.out.println(st.peek());
        System.out.println(st);
        
    }
}
