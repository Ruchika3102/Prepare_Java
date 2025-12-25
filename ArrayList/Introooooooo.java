package ArrayList;
// used when size is not fixed of array
public class Introooooooo {
    public static void main(String args[]){
        //syntax
        //ArrayList<Type>  obj = new ArrayList<Type>();
        ArrayList<Integer> list=new ArrayList<Integer>(10);//10 is the initial capacity
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(2));//get element at index 2
        System.out.println(list.contains(3));//check if 3 is present in the list
        list.set(2,5);//set index 2 to 5
        System.out.println(list);
        list.remove(1);//remove element at index 1
        System.out.println(list);
        }
    }



    //input 
    Scaner sc=new Scanner(System.in);
    int n=sc.nextInt();
    ArrayList<Integer> list=new ArrayList<Integer>();
    for(int i=0;i<n;i++){
        list.add(sc.nextInt());
    }
    System.out.println(list);


//mano appa initial size 5 deta and appa 6th element insert krna chahnde aw then oh 6 size da nhi 10 size di array list bnayu computer apne app and piche 5usch copy krdu then mano oh 10 vala v bhr gya and appa 11 krna chahnde aw then 20 di array list bnu