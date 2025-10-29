public class PrintAllSubsetsOfString {
    public static void main(String[] args) {
        String str = "abc";
        printSubsets(str, "", 0);
    }

    private static void printSubsets(String str, String current, int index) {
        // base case: if we've considered all characters
        if (index == str.length()) {
            System.out.println(current);
            return;
        }

        // include the current character
        printSubsets(str, current + str.charAt(index), index + 1);
        // exclude the current character
        printSubsets(str, current, index + 1);
    }
}
