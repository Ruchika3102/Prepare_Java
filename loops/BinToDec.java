import java.util.Scanner;
public class BinToDec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int bin=sc.nextInt(),dec=0,base=1;
        while(bin>0){
            int d=bin%10;
            dec+=d*base;
            base*=2;
            bin/=10;
        }
        System.out.println(dec);
        sc.close();
    }
}
