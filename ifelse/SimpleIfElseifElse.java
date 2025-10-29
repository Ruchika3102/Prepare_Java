import java.util.Scanner;
public class SimpleIfElseifElse{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter first number: ");
        int a=sc.nextInt();
        System.out.print("Enter second number: ");
        int b=sc.nextInt();
        if(a>b){
            System.out.print(a+" is greater than "+b);
        }
        else if(b>a){
            System.out.print(b+" is greater than "+a);
        }
        else{
            System.out.print("Both are equal");
        }
        sc.close();

    }
}