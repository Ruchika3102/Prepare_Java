import java.util.*;
public class ReverseStack {
    public static void main(String [] args){

        Stack<Integer> st=new Stack<>();
        
        st.push(1);
        st.push(2);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);


        //with new Stack
        Stack <Integer> stt=new Stack<>();
        while(st.size()>0){
            int x=stt.push(st.pop());
            System.out.print(x+" ");
        }

        System.out.println();



        //with new stack but if fist stack ch hi reverse krke pana then
        Stack <Integer> stt=new Stack<>();
        while(st.size()>0){
            stt.push(st.pop());
            
        }
        Stack <Integer> rt=new Stack<>();
        while(stt.size()>0){
            rt.push(stt.pop());

        }
        while(rt.size()>0){
            int x=st.push(rt.pop());
            System.out.print(x+" ");
        }





        //with arrays
        int n=st.size();
        int [] arr=new int[n];
        for(int i=n-1;i>=0;i--){
            arr[i]=st.pop();
            System.out.print(arr[i]+" ");
        }
    }
}


// with recursion
import java.util.*;
public class ReverseStack {

    public static void displayReverse(Stack<Integer> st){
        if(st.size()==0) return;
        int top=st.pop();
        System.out.print(top+" ");
        displayReverse(st);
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

        displayReverse(st);

    }
}


