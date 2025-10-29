package StringBuilders.Functions;

public class delete {
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder("Hello");
        sb.delete(0,2);
        System.out.println(sb);
    }
}
