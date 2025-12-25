import java.util.Scanner;
public class ForLoop{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Eneter n here:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Hello World");
        }
        sc.close();

    }
}
// if we dont give the stop limit then it will give infinite loopc
//jo for loop de andar define kita oh for lopp toi bhr nhi aa skda