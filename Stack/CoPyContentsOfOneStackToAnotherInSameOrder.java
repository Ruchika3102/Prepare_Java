import java.util.Stack;

public class CoPyContentsOfOneStackToAnotherInSameOrder {
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
            int x=st.peek();   //ah line likhn di lod nhi vese kyonki pop krde aw jad oh sirf remove nhi krda us kol last element di value v hundi aw so appa sirf eve v likh sakde aw ah 3 line di jgah ik line likho niche dsda
            stt.push(x);    //stt.push(st.pop()); like that
            st.pop();
        }
        System.out.println("The new stack formed after copy the elements is: "+stt);

        while(stt.size()>0){
            int x=st.push(stt.pop());
        }
        System.out.print("the correct stack is" +st);
    }
}
