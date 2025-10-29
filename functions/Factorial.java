import java.util.Scanner;
public class Factorial{
public static void factorial(int n){
    if(n<0){
        System.out.print("Invalid Number");
    }
    else if(n==0){
        System.out.print("The Factorial Of Given Number Is : 0");
    }
    else{
        int facti=1;
    for(int i=n;i>0;i--){
        facti=facti*i;
    }
    System.out.print("The Factorial Of Given Number Is :"+facti);
        }
}    
public static void main(String srgs[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter no here: ");
    int n=sc.nextInt();
    factorial(n);
    sc.close();

}
}
