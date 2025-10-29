import java.util.Scanner;
public class DecToBin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int dec=sc.nextInt();
        String bin="";
        while(dec>0){
            bin=(dec%2)+bin;
            dec/=2;
        }
        System.out.println(bin);
        sc.close();
    }
}
