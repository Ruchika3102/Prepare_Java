
import java.util.Scanner;
public class LinearSearch {
    public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter Size Of Array: ");
    int n= sc.nextInt();
    int marks[]=new int[n];
    for(int i=0;i<n;i++){
        System.out.print("Enter Marks Of Student "+(i+1)+": ");
        marks[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
        System.out.println(marks[i]);
    }
    System.out.print("Enter Element To Be Searched: ");
    int x=sc.nextInt();
    for(int i=0;i<n;i++){
        if(marks[i]==x){
            System.out.print("Element Found At Index: "+i);
            return;
        }
    }
    System.out.print("Element Not Found");
    sc.close();
}
}
