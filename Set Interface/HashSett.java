import java.util.HashSet;

public class HashSett {
    public static void main(String[] args) {
        HashSet<Integer> set= new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        System.out.println(set);
        System.out.println(set.contains(10));
        System.out.println(set.remove(30));
        System.out.println(set.remove(100)); //returns false since it dont have 100
        System.out.println(set);
        System.out.println(set.size());
        for(int i: set){
            System.out.print(i+" ");
        }
        set.clear();
        System.out.println(set);


        //Points to be noted
        /* 
         * Only one null value allowed
         * No order maintained
         * performance is faster due to no sorting
         */
    }

}
