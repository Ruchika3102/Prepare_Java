// in this we divide the array into two halves and then also divide those halves until we reach single element and then we start merging those elements in sorted order and repeat the process until all elements are merged and sorted
//use divide and conquer method by splitting into halves
//in ascending order
import java.util.Scanner;

public class MergeSort {
    
    // Function to merge two halves
    public static void merge(int arr[], int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int L[] = new int[n1];
        int R[] = new int[n2];

        // Copy data into temp arrays
        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        // Merge the two arrays
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Merge Sort function
    public static void mergeSort(int arr[], int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            // Recursively sort two halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Merge sorted halves
            merge(arr, left, mid, right);
        }
    }

    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Call Merge Sort
        mergeSort(arr, 0, n - 1);

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
// public class MergeSort {
//     // Function to merge two halves
//     public static void merge(int arr[], int left, int mid, int right) {
//         int n1 = mid - left + 1;
//         int n2 = right - mid;
//         int L[] = new int[n1];
//         int R[] = new int[n2];
//         // Copy data into temp arrays
//         for (int i = 0; i < n1; i++)
//             L[i] = arr[left + i];
//         for (int j = 0; j < n2; j++)
//             R[j] = arr[mid + 1 + j];
//         // Merge the two arrays
//         int i = 0, j = 0, k = left;
//         while (i < n1 && j < n2) {
//             if (L[i] >= R[j]) {
//                 arr[k] = L[i];
//                 i++;
//             } else {
//                 arr[k] = R[j];
//                 j++;
//             }
//             k++;
//         }
//         // Copy remaining elements
//         while (i < n1) {
//             arr[k] = L[i];
//             i++;
//             k++;
//         }
//         while (j < n2) {
//             arr[k] = R[j];
//             j++;
//             k++;
//         }
//     }
//     // Merge Sort function
//     public static void mergeSort(int arr[], int left, int right) {
//         if (left < right) {
//             int mid = (left + right) / 2;
//             // Recursively sort two halves
//             mergeSort(arr, left, mid);
//             mergeSort(arr, mid + 1, right);
//             // Merge sorted halves
//             merge(arr, left, mid, right);
//         }
//     }
//     // Main function
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number of elements: ");
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         System.out.println("Enter " + n + " elements:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         // Call Merge Sort
//         mergeSort(arr, 0, n - 1);
//         // Print sorted array
//         System.out.println("Sorted array:");
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         sc.close();
//     }
// }
