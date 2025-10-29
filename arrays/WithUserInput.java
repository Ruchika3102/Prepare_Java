import java.util.Scanner;
public class WithUserInput {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Size Of Array: ");
    int n=sc.nextInt();
    int marks[]=new int[n];
    for(int i=0;i<n;i++){
        System.out.print("Enter Marks Of Student "+(i+1)+": ");
        marks[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
        System.out.println(marks[i]);
    }
    sc.close();
}
}