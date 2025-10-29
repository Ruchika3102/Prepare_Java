public class Clear {
    public static void main(String args[]){
        int a=10;
        int position=1;
        int bitmask=1<<position;
        int notbitmask=~bitmask;
        int newnumber=a&notbitmask;
        System.out.println(newnumber);
    }
}
//do dry run of this code independently
