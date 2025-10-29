import java.util.Scanner;
public class FibbonacciSeries {
    static void printFibonacci(int n) {
        int first = 0, second = 1;
        System.out.print(first + " " + second);
        for (int i = 3; i <= n; i++) {
            int next = first + second;
            System.out.print(" " + next);
            first = second;
            second = next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        if (n < 1) {
            System.out.println("Enter a positive integer!");
        } else if (n == 1) {
            System.out.println("0");
        } else {
            printFibonacci(n);
        }
        sc.close();
    }
}

