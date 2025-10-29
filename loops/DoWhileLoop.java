import java.util.Scanner;
public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n here:");
        int n= sc.nextInt();
        int i=0;
        do {
            System.out.println("Hello");
            i++;
        } while (i<=n);
        sc.close();
    }
}
