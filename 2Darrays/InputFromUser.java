import java.util.Scanner;
public class InputFromUser {
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
        System.out.println("The elements of the array are:");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}



// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
       int [][] arr=new int[n][m];
       for(int i=0;i<arr.length;i++){
           for(int j=0;j<arr[i].length;j++){
               arr[i][j]=sc.nextInt();
           }
       }
       for(int i=0;i<arr.length;i++){
           for(int j=0;j<arr[i].length;j++){
               System.out.print(arr[i][j]);
            }
    System.out.println();
        }
}
}
