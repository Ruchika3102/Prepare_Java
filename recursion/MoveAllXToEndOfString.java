import java.util.*;
public class MoveAllXToEndOfString {
    public static String moveAllXToEnd(String str) {
        if (str.isEmpty()) {
            return str;
        }
        char firstChar = str.charAt(0);
        String restOfString = moveAllXToEnd(str.substring(1));
        if (firstChar == 'x') {
            return restOfString + firstChar;
        } else {
            return firstChar + restOfString;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String result = moveAllXToEnd(str);
        System.out.println("Original string: " + str);
        System.out.println("String after moving all 'x' to the end: " + result);
        sc.close();
    }
}
