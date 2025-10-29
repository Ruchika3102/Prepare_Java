import java.util.Scanner;
public class Time3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no here: ");
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
            System.out.println("Hello");
            }
        }
        sc.close();
    }
    //here time complexity is n*m so O(n*m)
    //this is wrost case

}
