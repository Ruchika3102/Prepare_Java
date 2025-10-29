import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt(),n=sc.nextInt();
        long p=1;
        for(int i=1;i<=n;i++) p*=x;
        System.out.println(p);
        sc.close();
    }
}
