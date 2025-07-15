import java.util.LinkedHashSet;

public class LinkeddHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> l= new LinkedHashSet<>();
        l.add(30);
        l.add(40);
        l.add(90);
        l.add(100);
        l.add(200);
        System.out.println(l);
        System.out.println(l.contains(100));
        System.out.println(l.size());
        System.out.println(l.remove(200));
        System.out.println(l.size());
        l.clear();
        System.out.println(l);
        //stores unique elements and remembers the order they were added.
        //Insertion Order preserved
        //Performance is slower due to order tracking
        
    }
}
