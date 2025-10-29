import java.util.Scanner;
public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),flag=1;
        if(n<=1) flag=0;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){ flag=0; break; }
        }
        if(flag==1) System.out.println("Prime");
        else System.out.println("Not Prime");
        sc.close();
    }
}
