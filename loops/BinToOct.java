import java.util.Scanner;
public class BinToOct {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int bin=sc.nextInt(),dec=0,base=1;
        while(bin>0){
            int d=bin%10;
            dec+=d*base;
            base*=2;
            bin/=10;
        }
        String oct="";
        while(dec>0){
            oct=(dec%8)+oct;
            dec/=8;
        }
        System.out.println(oct);
        sc.close();
    }
}
