// in this we choose a pivot element and partition the array such that elements less than pivot are on left side and elements greater than pivot are on right side and then we recursively apply the same logic to left and right subarrays until the whole array is sorted
// use divide and conquer method by pivot element
// in ascending order
import java.util.Scanner;

public class QuickSort {

    // Partition function
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high]; // choosing last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // place pivot in correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // QuickSort function (recursive)
    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            // Recursively sort left and right subarrays
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

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

        // Call QuickSort
        quickSort(arr, 0, n - 1);

        // Print sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}



//in descending order
// import java.util.Scanner;
// public class QuickSort {
//     // Partition function
//     public static int partition(int arr[], int low, int high) {
//         int pivot = arr[high]; // choosing last element as pivot
//         int i = low - 1;
//         for (int j = low; j < high; j++) {
//             if (arr[j] > pivot) {
//                 i++;
//                 // swap arr[i] and arr[j]
//                 int temp = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = temp;
//             }
//         }
//         // place pivot in correct position
//         int temp = arr[i + 1];
//         arr[i + 1] = arr[high];
//         arr[high] = temp;
//         return i + 1;
//     }
//     // QuickSort function (recursive)
//     public static void quickSort(int arr[], int low, int high) {
//         if (low < high) {
//             int pi = partition(arr, low, high);
//             // Recursively sort left and right subarrays
//             quickSort(arr, low, pi - 1);
//             quickSort(arr, pi + 1, high);
//         }
//     }
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
//         // Call QuickSort
//         quickSort(arr, 0, n - 1);
//         // Print sorted array
//         System.out.println("Sorted array:");
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         sc.close();
//     }
// }
