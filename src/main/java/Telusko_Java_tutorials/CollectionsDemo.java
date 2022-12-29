package Telusko_Java_tutorials;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionsDemo {
    public static void main(String[] args) {
        Collection<Integer> c=new ArrayList<>();
        c.add(1);
        c.add(2);
        //c.add("String");
        //c.add(5.5);

        c.remove(2);
        for (Object o:c) {
            System.out.println(o);
        }

    }
}
