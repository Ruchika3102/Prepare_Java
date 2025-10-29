// in this firstly find the minimum element in the array and swap it with the first element then same for all other elements donot use first element now then find the minimum element and swap it with the second element and so on 
//in ascending order
import java.util.Scanner;

public class SelectionSort {
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

        // Selection Sort logic
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap arr[i] and arr[minIndex]
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
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
// public class SelectionSort {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//
//         // Taking array input
//         System.out.print("Enter number of elements: ");
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//
//         System.out.println("Enter " + n + " elements:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//
//         // Selection Sort logic
//         for (int i = 0; i < n - 1; i++) {
//             int maxIndex = i;
//             for (int j = i + 1; j < n; j++) {
//                 if (arr[j] > arr[maxIndex]) {
//                     maxIndex = j;
//                 }
//             }
//             // Swap arr[i] and arr[maxIndex]
//             int temp = arr[maxIndex];
//             arr[maxIndex] = arr[i];
//             arr[i] = temp;
//         }
//
//         // Printing sorted array
//         System.out.println("Sorted array:");
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         sc.close();
//     }
// }
