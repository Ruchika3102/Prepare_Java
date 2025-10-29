import java.util.Scanner;
public class Time4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no here: ");
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Hello");
            }
        for(int j=0;j<m;j++){
            System.out.println("Hello");
            }
        sc.close();
    }
    //here time complexity is n+m so O(n+m)
    //this is wrost case
}
// from these Time1,Time2,Time3,Time4 Time1 is best case according to these all because in Time1 is minimum
