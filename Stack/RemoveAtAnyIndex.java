import java.util.*;
public class RemoveAtAnyIndex {
    public static void main(String [] args){
        Stack<Integer> st=new Stack<>();

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            st.push(x);
        }
        int m=sc.nextInt();
        Stack<Integer> rt=new Stack<>();
        while(st.size()>m){
            rt.push(st.pop());
        }
        st.pop();
        while(rt.size()>0){
            st.push(rt.pop());
        }
        System.out.print(st+" ");
    }
}
