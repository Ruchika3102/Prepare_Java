// in this we assure first element as sorted and all other elements are unsorted we take first element from unsorted part and compare it with all elements in sorted part and place it at correct position in sorted part and repeat the process until all elements are sorted

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking array input
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Insertion Sort logic inside main
        for (int i = 1; i < n; i++) {
            int key = arr[i];       // element to be inserted
            int j = i - 1;

            // Move elements that are greater than key to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;   // insert key at correct position
        }

        // Printing sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }

}


//in descending order
// import java.util.Scanner;
// public class InsertionSort {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         // Taking array input
//         System.out.print("Enter number of elements: ");
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         System.out.println("Enter " + n + " elements:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         // Insertion Sort logic inside main
//         for (int i = 1; i < n; i++) {
//             int key = arr[i];       // element to be inserted
//             int j = i - 1;
//             // Move elements that are smaller than key to one position ahead
//             while (j >= 0 && arr[j] < key) {
//                 arr[j + 1] = arr[j];
//                 j--;
//             }
//             arr[j + 1] = key;   // insert key at correct position
//         }
//         // Printing sorted array
//         System.out.println("Sorted array:");
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         sc.close();
//     }
// }
