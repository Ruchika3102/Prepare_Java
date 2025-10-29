import java.util.Scanner;
public class BasePower {
    static long power(int x, int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= x;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base (x): ");
        int x = sc.nextInt();
        System.out.print("Enter exponent (n): ");
        int n = sc.nextInt();
        System.out.println(x + "^" + n + " = " + power(x, n));
        sc.close();
    }
}

