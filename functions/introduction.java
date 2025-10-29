// int , float return values
// void directly prints anything
import java.util.Scanner;
public class introduction {
    public static void printMyName(String name){     //printMyName is a function name
        System.out.println("My name is "+name);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name:");
        String name=sc.nextLine();
        printMyName(name);
        sc.close();
    }
    }
//memory stack di form ch save hundi aw sareya nalo phla and niche main function da box bnu then usto uppr function da first function da than second function da
    