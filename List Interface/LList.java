import java.util.Iterator;
import java.util.LinkedList;

public class LList {
   public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>();
    list.add(10);
    list.add(20);
    list.addFirst(5);
    list.addLast(30);
    System.out.println(list);

    list.removeFirst();
    list.removeLast();
    System.out.println(list);

    System.out.println(list.getFirst());

    System.out.println(list.getLast());


    //Iterating through foreach

    for(Integer i: list){
        System.out.print(i+"-> ");
    }
System.out.println();
    //Through Iterator

    Iterator<Integer> iter= list.iterator();
    while(iter.hasNext()){
  
        System.out.println(iter.next());
    }
    list.pop();
    list.pop();// if empty it will throw execption , NoSuchElementException
    list.poll();

    list.add(100);
    list.remove(0);// removes the element at specific index, if not then IndexOutOfBounDException

    list.peek(); // returns first ele of ll

    list.push(1002); // add to begining of LL
   } 
}
