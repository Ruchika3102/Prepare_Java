package LinkedList;

public class Palindrome {
    class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class PalindromeLL {

    static boolean isPalindrome(Node head) {

        // step 1: count size
        int n = 0;
        Node temp = head;
        while (temp != null) {
            n++;
            temp = temp.next;
        }

        // step 2: store in array
        int[] arr = new int[n];
        temp = head;
        for (int i = 0; i < n; i++) {
            arr[i] = temp.data;
            temp = temp.next;
        }

        // step 3: check palindrome
        int i = 0, j = n - 1;
        while (i < j) {
            if (arr[i] != arr[j])
                return false;
            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        a.next = new Node(2);
        a.next.next = new Node(2);
        a.next.next.next = new Node(1);

        System.out.println(isPalindrome(a)); // true
    }
}

}
