// int , float return values
// void directly prints anything
// import java.util.Scanner;
// public class introduction {
//     public static void printMyName(String name){     //printMyName is a function name
//         System.out.println("My name is "+name);
//     }
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter your name:");
//         String name=sc.nextLine();
//         printMyName(name);
//         sc.close();
//     }
//     }
//memory stack di form ch save hundi aw sareya nalo phla and niche main function da box bnu then usto uppr function da first function da than second function da


// FUNCTION DE ANDAR VALA VARIABLE BHR NHI AA SAKDA 

//IF WE CHANGE THE VALUE OF INT FLOAT STRING VARIABLE INSIDE THE FUNCTION IT WILL NOT AFFECT THE VALUE OUTSIDE THE FUNCTION
//BUT IF WE CHANGE THE VALUE OF ARRAY OR OBJECT INSIDE THE FUNCTION IT WILL AFFECT THE VALUE OUTSIDE THE FUNCTION
    


// //block exapmle
// public class introduction {
//     public static void main(String args[]){
//         int a=10;
//         int b=20;
//         //block starts here with curly braces
//         {
//             //int a=100; //error a is already defined in main method
//             a=50; // reassigning the value of a
//             System.out.println(a);
//             int c=30; //value initialised in this block will remain in this block;
//         }
//         //ends here with curly braces
//          System.out.println(a); // prints 50 block ch pass by refreance hunda original value nu v change kr dind
//          System.out.println(c);//error c can define in block s it cannot access outside the block
//          int c=100; // we can define c here as this is a new scope    jo block ch define krya unu outside the block frto to define kr sakde aw pr vo outside the block define krta isny frto inside the block nhi define kr sakde
//          System.out.println(c); // prints 100
//     }
// }



// //shadowing example
// public class introduction {
//     static int x=100; // global variable this available on both main and function
//     public static void main(String args[]){
//         System.out.println(x); // prints 100
//         int x=50; // local variable

//         // // if we print x between declaring and initialising it will show error like
//         // int x;
//         // System.out.println(x); // error variable x might not have been initialized
//         // x=50; // initialising local variable


//         System.out.println(x); // prints 50

//         fun();
//     }
//     public static void fun(){
//         System.out.println(x); // prints 100
//     }
// }
// //shadowing means if we define a variable with same name in local scope as in global scope then local variable will be given preference





//VarArgs example
import java.util.Arrays;
public class introduction {
    public static void printNumbers(int... numbers){ //varargs   //... means variable arguments // it allows us to pass variable number of arguments to a function // it is treated as an array inside the function // int ...numbers means in array there are integer values // we also use float...numbers , String...name
            System.out.println(Arrays.toString(numbers)); // printing the array
    }
    public static void main(String args[]){
        printNumbers(1,2,3,4,5); // passing multiple arguments
        printNumbers(10,20); // passing two arguments
        printNumbers(); // passing no arguments // return vacant array
    }
}
//we also use multiple parameters with varargs but varargs should be the last parameter
//eg public static void fun(int a, String b, int... numbers){}  valid   
//eg public static void fun(int... numbers, int a){}  invalid
//eg public static void fun(String b, int... numbers){}  valid
//eg public static void fun(int... numbers, String b){}  invalid
//import java.util.Arrays; // we have to import this to use Arrays.toString() method
//Arrays.toString() method is used to convert array to string for printing purpose


// //function overloading example   // but in this we can not pass empty arguments as it will confuse the compiler
// public class introduction {  
//     public static int add(int a, int b){ // function to add two integers
//         return a+b;
//     }
//     public static double add(double a, double b){ // function to add two doubles
//         return a+b;
//     }
//     public static String add(String a, String b){ // function to add two strings
//         return a+b;
//     }
//     public static void main(String args[]){
//         System.out.println(add(10,20)); // calls the first function
//         System.out.println(add(10.5,20.5)); // calls the second function
//         System.out.println(add("Hello ","World")); // calls the third function
//     }
// }


// we also use function overloading with varargs
//eg public static void fun(int... numbers){}
//eg public static void fun(String... names){}
