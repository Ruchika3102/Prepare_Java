import java.util.Scanner;            //or import java.util.*;
public class UserInput{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        // integer variable input
        System.out.println("ENTEr the age: ");
        int age = sc.nextInt();
        // double variable input
        System.out.println("Enter the marks:");
        double marks = sc.nextDouble();                     //sc.nextFloat();       for float input

        System.out.println("ENTEr the nick name:");
        String name = sc.next();              //input for single word 

        sc.nextLine();      // we can not take inputs of two strings at a tym so we use this line  jh appa ik hi string mtlb 2 ya 2 to vad words di string da input le rhe aw tah appa nu ah line likhn di lod nhi simple String name= sc.nextLine(); is nal input le sakde aw

        System.out.println("Enter your full name:");
        String fullname = sc.nextLine();        //input for a line

        System.out.println("AGE= "+ age);
        System.out.println("MARKS= "+ marks);
        System.out.println("NAME= " + name);
        System.out.println("FULLNAME= " + fullname);
        sc.close();
    }
}