import java.util.Scanner;
 public class SumOfTwoNumber{
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number:");
        int num1=sc.nextInt();
        System.out.print("Enter Second Number: ");
        int num2=sc.nextInt();
        int sum=num1+num2;
        System.out.print("Sum: "+sum);
        sc.close();

    }
 }
