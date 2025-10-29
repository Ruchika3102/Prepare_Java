import java.util.Scanner;
public class Time1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no here: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println(i);
        }
        sc.close();
    }
    //here time complexity is directly proportion to n
    // means time complexity=n; so O(n)
    //this is wrost case
}
