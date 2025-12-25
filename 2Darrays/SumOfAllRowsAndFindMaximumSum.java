import java.util.Scanner;

public class SumOfAllRowsAndFindMaximumSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
       int [][] arr=new int[n][m];
       for(int i=0;i<arr.length;i++){
           for(int j=0;j<arr[i].length;j++){
               arr[i][j]=sc.nextInt();
           }
       }
       for(int i=0;i<arr.length;i++){
           for(int j=0;j<arr[i].length;j++){
               System.out.print(arr[i][j]+" ");
            }
    System.out.println();
        }
        
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=0;
            for(int j=0;j<arr[i].length;j++){
                sum=sum+arr[i][j];
            }
            System.out.println(sum+" ");
            }
            
            int max=0;
            int sum1=0;
            for(int i=0;i<arr.length;i++){
                sum1=0;
            for(int j=0;j<arr[i].length;j++){
                sum1=sum1+arr[i][j];
            }
            
            if(max<sum1){
                max=sum1;
                System.out.println(max);
            }
            }
            
}
}
