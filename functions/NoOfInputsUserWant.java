import java.util.Scanner;
public class NoOfInputsUserWant {
    static int positive = 0, negative = 0, zero = 0; 
    public static void countt(int n) {
        if (n < 0) {
            negative++;
        } else if (n == 0) {
            zero++;
        } else {
            positive++;
        }
    }
    public static void displayCounts() {    //we initialise positive, negative and zero after class that's why  it works in both functions and here importatnt to use static to retain and update the count across multiple function calls.
        System.out.println("Positive Numbers: " + positive);
        System.out.println("Negative Numbers: " + negative);
        System.out.println("Zeroes: " + zero);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of inputs you want: ");
        int m = sc.nextInt();
        int count = 0;
        System.out.println("Enter your inputs: ");
        do {
            int n = sc.nextInt();
            count++;
            countt(n);   //when i call countt(n) outside do while loop it shows error Error because n was declared inside the loop, so it’s not visible outside
        } while (count != m);
        displayCounts(); 
        sc.close();
    }
}
