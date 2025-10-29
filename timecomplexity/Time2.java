import java.util.Scanner;
public class Time2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no here: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            System.out.println("Hello");
            }
        }
        sc.close();
    }
    //here time complexity is n*n=n^2 so O(n^2)
    //this is wrost case
}
