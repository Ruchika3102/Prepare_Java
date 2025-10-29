public class Get {
    public static void main(String args[]){
        int a=10;
        int position=2;
        int bitmask=1<<position;
        if((bitmask&a)==0){
            System.out.println("Bit was zero");
        }
        else{
            System.out.println("Bit was one");
        }
    }
}
//do dry run of this code independently