import java.util.Scanner;
public class InputUser {
    
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("ENTEr the nick name:");
        String name = sc.next();              //input for single word 

        sc.nextLine();      // we can not take inputs of two strings at a tym so we use this line  jh appa ik hi string mtlb 2 ya 2 to vad words di string da input le rhe aw tah appa nu ah line likhn di lod nhi simple String name= sc.nextLine(); is nal input le sakde aw

        System.out.println("Enter your full name:");
        String fullname = sc.nextLine();        //input for a line
        System.out.println("NAME= " + name);
        System.out.println("FULLNAME= " + fullname);
        sc.close();
}
}