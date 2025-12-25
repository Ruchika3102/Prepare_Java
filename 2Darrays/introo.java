// rows= _____
// coloumns=|
//          |


//int[][] arr=new int[3][4]; //declaration and memory allocation [rows][coloumns]
//int[][] arr={{1,2,3},{4,5,6},{7,8,9}}; //declaration and memory allocation


// NO. OF ROWS ARE MANDATORY BUT NO. OF COLOUMNS ARE OPTIONAL
// int[][] arr=new int[3][]; //valid
// int[][] arr=new int[][4]; //invalid
// int[][] arr=new int[3][4]; //valid
//BECAUSE 2D ARRAY IS ALSO LIKE {{1,2,3},{4,5},{6,7,8,9}}
//ARR[2] IT GIVES 3RD ROW I.E {6,7,8,9}
//ARR[2][3] IT GIVES 4TH ELEMENT OF 3RD ROW I.E 9

//WE TAKE INPUT OF THESE TYPE OF ARRAYS By
import java.util.*;
public class introo {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[3][4];
        System.out.println(arr.length);    //return no. of rows
        System.out.println(arr[0].length); //return no. of coloumns
        //input
        for(int i=0;i<arr.length;i++){ //for rows
            for(int j=0;j<arr[i].length;j++){ //for coloumns
                arr[i][j]=sc.nextInt();
            }
        }
        //output
        for(int i=0;i<arr.length;i++){ //for rows
            for(int j=0;j<arr[i].length;j++){ //for coloumns
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        //or 
        //output
        for(int i=0;i<arr.length;i++){ //for rows
                System.out.println(Arrays.toString(arr[i]));
        }
        // or
        //output
        for(int[] a:arr){    // int[]a means every element in array is integer a means elements and :arr means from where we take elements
            System.out.println(Arrays.toString(a));
        }
    }
}