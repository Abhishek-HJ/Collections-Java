import java.util.Stack;
 // Stack inherits the vector class , Vector class implements list interface
 // Vectors are thread safe , slower
public class Stackk {
    public static void main(String[] args) {
        Stack<Integer>  stack= new Stack<>();
            stack.push(10);
            stack.push(200);
            System.out.println(stack.pop());   // remove top element
            System.out.println(stack.peek());  //returns top element
           System.out.println( stack.empty()); // returns true or false
           System.out.println(stack.search(19)); // returns -1 or 11
           System.out.println(stack.contains(19)); // returns true or false

    }
    
}
