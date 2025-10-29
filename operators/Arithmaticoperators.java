// these are of two types- binary and unary
//binary are= +,-,*,/,%   needs two operands
// unary are= ++(Increment),--(Decrement)  needs one operand

// Pre-increement, Post-Increement i know meaning of both very welll

//relational operators are used to check relation between two operands(==,!=,>,<,>=,<=)
//the output of relational operators are boolean values
//logical operators are used to combine multiple boolean expressions(&&,||,!)    like question is 12&&30=true or false this gives true because both are true because both are non-zero and we apply and operation
//we use  logical not like this- !(a>b)  it means a is not greater than b
//bitwise operators are used to perform operations on bits(&,|,^,~,<<,>>)
//assignment operators are used to assign values to variables(=,+=,-=,*=,/=,%=)
// ternary operators are used to evaluate a condition and return one of two values based on the result(condition ? value1 : value2)
// & gives 1,1=1;1,0=0;0,1=0;0,0=0
// | gives 1,1=1;1,0=1;0,1=1;0,0=0
// ^ gives 1,1=0;1,0=1;0,1=1;0,0=0 (binary exor)
// ~ gives 1=0;0=1
// << gives left shift  (eg= 2<<1 means write 2 in binary and shift it to left by 1 bit so 0010 becomes 0100 which is 4 in decimal)
// >> gives right shift (eg= 2>>1 means write 2 in binary and shift it to right by 1 bit so 0010 becomes 0001 which is 1 in decimal)


// public class Arithmaticoperators {
//         public static void main(String[] args) {
//                 int a = 10, b = 5;
//                 System.out.println("Addition: "+(a + b));
//                 System.out.println("Subtraction: "+(a - b));
//                 System.out.println("Multiplication: "+(a * b));
//                 System.out.println("Division: "+(a / b));
//                 System.out.println("Modulus: "+(a % b));
//         }
// }




//or



public class Arithmaticoperators{
    public static void main(String args[]){
        int a=10,b=5;
        int sum=a+b;
        int sub=a-b;
        int div=a/b;
        int mul=a*b;
        System.out.println("Addition= "+sum);   //or System.out.println(sum);
        System.out.println("Subtraction= "+sub);
        System.out.println("Multiplication= "+mul);
        System.out.println("Division= "+div);
    }
}