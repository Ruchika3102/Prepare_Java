import java.util.*;
public class DisplayStack {
    public static void main(String [] args){

        Stack<Integer> st=new Stack<>();
        
        st.push(1);
        st.push(2);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);

        // System.out.println("The Stack is: "+st); eh line use krn di jgah appa Stack nu loop nal print krke dekh rhe aw

        //with new Stack
        Stack <Integer> stt=new Stack<>();
        while(st.size()>0){
            stt.push(st.pop());
        }
    
        while(stt.size()>0){
            int x=stt.pop();
            System.out.print(x+" ");
            st.push(x);
        }

        System.out.println();

        //with arrays
        int n=st.size();
        int [] arr=new int[n];
        for(int i=n-1;i>=0;i--){
            arr[i]=st.pop();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
            st.push(arr[i]);
        }


    }
}


// with recursion
import java.util.*;
public class DisplayStack {         //time Complexity=O(n)    space complexity=O(n)

    public static void display(Stack<Integer> st){
        if(st.size()==0) return;
        int top=st.pop();
        display(st);
        System.out.print(top+" ");
        st.push(top);
        return;
    }
    public static void main(String [] args){

        Stack<Integer> st=new Stack<>();
        
        st.push(1);
        st.push(2);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);

        display(st);

        // System.out.println("The Stack is: "+st); eh line use krn di jgah appa Stack nu loop nal print krke dekh rhe aw

        

    }
}