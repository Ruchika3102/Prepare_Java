public class Set {
    public static void main(String args[]){
        int a=10;
        int position=2;
        int bitmask=1<<position;
        int newnumber=a|bitmask;
        System.out.println(newnumber);
    }
}
//do dry run of this code independently
