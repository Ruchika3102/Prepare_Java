import java.util.*;

public class KeypadCombinations {

    // Mapping for digits 0-9. Index 0 -> "0", 1 -> "1" (we keep them simple).
    // For digits 2-9 use usual phone-letter mapping.
    private static final String[] MAP = {
        "0",    // 0
        "1",    // 1
        "abc",  // 2
        "def",  // 3
        "ghi",  // 4
        "jkl",  // 5
        "mno",  // 6
        "pqrs", // 7
        "tuv",  // 8
        "wxyz"  // 9
    };

    /**
     * Returns all possible letter combinations for the given digit string.
     * If digits is empty, returns an empty list.
     */
    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) return result;

        StringBuilder current = new StringBuilder();
        backtrack(digits, 0, current, result);
        return result;
    }

    // Recursive backtracking helper
    private static void backtrack(String digits, int index, StringBuilder current, List<String> result) {
        // base case: we've processed all digits
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        char digitChar = digits.charAt(index);
        // guard: skip characters that are not digits or out of range
        if (digitChar < '0' || digitChar > '9') return;

        int digit = digitChar - '0';
        String letters = MAP[digit];

        // If mapping is "0" or "1" (no letters) — you can either skip or include the digit itself.
        // Here we include the digit character as the only option (common choice).
        if (letters.length() == 1 && (digit == 0 || digit == 1)) {
            current.append(letters);
            backtrack(digits, index + 1, current, result);
            current.deleteCharAt(current.length() - 1);
            return;
        }

        // For each letter mapped to this digit, append and recurse
        for (int i = 0; i < letters.length(); i++) {
            current.append(letters.charAt(i));
            backtrack(digits, index + 1, current, result);
            // undo append (backtrack)
            current.deleteCharAt(current.length() - 1);
        }
    }

    // Simple test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter digits (2-9, may include 0/1): ");
        String digits = sc.nextLine().trim();

        List<String> combos = letterCombinations(digits);
        System.out.println("Total combinations: " + combos.size());
        for (String s : combos) {
            System.out.println(s);
        }
        sc.close();
    }
}
