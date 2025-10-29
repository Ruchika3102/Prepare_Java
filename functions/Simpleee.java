import java.util.Scanner;
public class Simpleee{
    public static int Sum(int a,int b){
        return a+b;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First Number Here: ");
        int a=sc.nextInt();
        System.out.print("Enter Second Number Here: ");
        int b=sc.nextInt();
        int c=Sum(a,b);
        System.out.print("The Sum Of These Two Numbers Is :"+c);
        sc.close();

    }
}