import java.util.Scanner;
public class WhileLoop{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Eneter n here:");
        int n=sc.nextInt();
        int i=0;
        while(i<n){
            System.out.println("Hello");
            i++;
        }
        sc.close();

    }
}