import java.util.Scanner;

public class Reverse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = sc.nextLine(); // take input from user
        
        StringBuilder sb = new StringBuilder(input);
        sb.reverse(); // reverse the string
        
        System.out.println("Reversed string: " + sb);
        
        sc.close();
    }
}
