package Youtube_DSA_Java;

import java.util.Iterator;
import java.util.Stack;

public class StackImplementation {
    public static void main(String[] args) {
        //Creating Stack
        Stack<Integer> s1 = new Stack<>();

        // Adding elements in Stack
        s1.push(2);
        s1.push(3);
        s1.push(9);
        s1.push(4);
        System.out.println("Stack elements are: "+s1);

        // size and sort operation
        System.out.println("Size and Sorting");
        System.out.println(s1.size());
        s1.sort(null);
        System.out.println(s1);

        // Peek elements
        System.out.println(s1.peek());

        // search for an element's index
        int indexFound = s1.search(2);
        System.out.println(indexFound);

        // Iterator
        Iterator<Integer> it = s1.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }

        // Deleting elements
        s1.pop();
        s1.pop();
        s1.pop();
        s1.pop();

        // check empty
        boolean status = s1.empty();
        System.out.println("\n"+status);

    }
}
