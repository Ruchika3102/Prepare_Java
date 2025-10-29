import java.util.*;
public class PrintAllSubsequencesOfString {
    public static void printSubsequences(String str, String current, int index) {
        if (index == str.length()) {
            System.out.println(current);
            return;
        }
        // Include the current character
        printSubsequences(str, current + str.charAt(index), index + 1);
        // Exclude the current character
        printSubsequences(str, current, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("All subsequences of the string \"" + str + "\":");
        printSubsequences(str, "", 0);
        sc.close();
    }
}
//time complexity: O(2^n) where n is the length of the string