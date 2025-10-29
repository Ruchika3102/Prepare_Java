//if we made to 1 then code is same as set bit
//if we made to 0 then code is same as clear bit
//we have to take input from user for this


//for 1
// public class Update {
//     public static void main(String args[]){
//         int a=10;
//         int position=2;
//         int bitmask=1<<position;
//         int newnumber=a|bitmask;
//         System.out.println(newnumber);
//     }
// }


// for 0
// public class Update {
//     public static void main(String args[]){
//         int a=10;
//         int position=2;
//         int bitmask=1<<position;
//         int notbitmask=~bitmask;
//         int newnumber=a&notbitmask;
//         System.out.println(newnumber);
//     }
// }



//combine both using scanner
import java.util.Scanner;
public class Update {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a=sc.nextInt();
        System.out.print("Enter the position: ");
        int position=sc.nextInt();
        System.out.print("Enter the value(0 or 1): ");
        int value=sc.nextInt();
        int bitmask=1<<position;
        if(value==1){
            int newnumber=a|bitmask;
            System.out.println("Updated number: "+newnumber);
        }
        else{
            int notbitmask=~bitmask;
            int newnumber=a&notbitmask;
            System.out.println("Updated number: "+newnumber);
        }
        sc.close();
    }
}

