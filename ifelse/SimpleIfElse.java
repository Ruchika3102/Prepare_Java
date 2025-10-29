import java .util.Scanner;
public class SimpleIfElse{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter Age Here: ");
        int age=sc.nextInt();
        if(age>=18){
            System.out.print("Adult");
        }
        else{
            System.out.print("Not Adult");
        }
        sc.close();

    }
}