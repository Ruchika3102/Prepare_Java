package ArrayList;

public class MultiDimensionalArrayList {
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        //initialization
        for(int i=0;i<3;i++){
            list.add(new ArrayList<>());
        }
        //input
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                list.get(i).add(sc.nextInt());
            }
        }
        //adding elements
        for(int i=0;i<3;i++){
            for(int j=1;j<=3;j++){
                list.get(i).add(j*i);
            }
        }
        System.out.println(list);
        //get element at index 1 of arraylist at index 2
        System.out.println(list.get(2).get(1));
    }
}
