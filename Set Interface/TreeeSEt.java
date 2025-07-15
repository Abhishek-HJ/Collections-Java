import java.util.TreeSet;

public class TreeeSEt {
    public static void main(String[] args) {
       TreeSet<Integer> tset= new TreeSet<>();
       tset.add(1);
       tset.add(2);
       tset.add(3);
       tset.add(8);
       tset.add(5);
       System.out.println(tset);
       tset.remove(5);
       System.out.println(tset);
       System.out.println(tset.contains(4));
       System.out.println(tset.size());
       for(int i : tset){
        System.out.println(i);
       }

       //it is slower
       // maintains order (sorting)

    }
}
