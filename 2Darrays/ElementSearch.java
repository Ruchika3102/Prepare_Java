import java.util.Scanner;
public class ElementSearch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = sc.nextInt();
        int[][] arr = new int[rows][columns];
        System.out.println("Enter elements of the array:");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter element to search: ");
        int target = sc.nextInt();
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                if(arr[i][j] == target){
                    System.out.println("Element found at position: (" + i + ", " + j + ")");
                    return;
                }
                
            }
        }
        System.out.println("Element not found in the array.");
        sc.close();
    }
}
