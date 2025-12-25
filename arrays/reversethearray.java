public class reversethearray {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        for(int i=0;i<n/2;i++){
            //swap arr[i] and arr[n-i-1]
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        //print the reversed array
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}


//or using while loop
public class reversethearray {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        int left=0;
        int right=n-1;
        while(left<right){
            //swap arr[left] and arr[right]
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        //print the reversed array
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}   


