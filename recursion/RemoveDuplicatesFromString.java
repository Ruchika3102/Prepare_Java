import java.util.*;
public class RemoveDuplicatesFromString {
    public static String removeDuplicates(String str) {
        if (str.length() < 2) {
            return str;
        }
        char firstChar = str.charAt(0);
        String restOfString = removeDuplicates(str.substring(1));
        if (restOfString.startsWith(String.valueOf(firstChar))) {
            return restOfString;
        } else {
            return firstChar + restOfString;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String result = removeDuplicates(str);
        System.out.println("Original string: " + str);
        System.out.println("String after removing duplicates: " + result);
        sc.close();
    }
}
