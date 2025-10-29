import java.util.Scanner;
public class SumOfNNaturalNo {
    public static int sum(int n){
        if (n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else {
            return n+sum(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int sum=sum(n);
        System.out.println("Sum of first "+n+" natural numbers is: "+sum);
        sc.close();
    }
}
