import java.util.*;
public class UniqueSubsequencesOfString {
    public static void uniqueSubsequences(String str, String current, int index, java.util.Set<String> result) {
        if (index == str.length()) {
            result.add(current);
            return;
        }
        // Include the current character
        uniqueSubsequences(str, current + str.charAt(index), index + 1, result);
        // Exclude the current character
        uniqueSubsequences(str, current, index + 1, result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        java.util.Set<String> result = new java.util.HashSet<>();
        uniqueSubsequences(str, "", 0, result);
        System.out.println("Unique subsequences of the string \"" + str + "\":");
        for (String subsequence : result) {
            System.out.println(subsequence);
        }
        sc.close();
    }
}
