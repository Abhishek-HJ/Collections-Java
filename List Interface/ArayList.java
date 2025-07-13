import java.util.ArrayList;
import java.util.Collections;
public class ArayList{
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list);
        ArrayList<Integer> newlist= new ArrayList<>();
        newlist.add(10); // Adds elemnet to end of the list
        newlist.add(20);
        list.add(2);
        list.addAll(newlist); // Adds ones list element to given list
        System.out.println(list);
        list.add(1,9090); //Adds at specified index
        System.out.println(list);
        if(list.contains(10)){ // To check wheter the given element present in the list
            System.out.println("Yes it has");
        }
        else{
            System.out.println("No!!!");
        }
        System.out.println(list.get(0));// To get element of specified index

        System.out.println(list.indexOf(2)); //Return the position of the first occurrence of an item in the list

        System.out.println(list.lastIndexOf(2));  //Return the position of the last occurrence of an item in the list

        Collections.sort(list); // Sorts the list

        list.remove(3);// removes elment at specified index

        newlist.clear();
        System.out.println(newlist);
        list.removeAll(newlist);
        System.out.println(list);
        newlist.add(1);
        newlist.add(2);
        list.removeAll(newlist);
        System.out.println(list);
        

    }
}