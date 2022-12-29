package Telusko_Java_tutorials;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrayDuplicates {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Navin");
        names.add("Mangesh");
        names.add("Navin");
        names.add("Suyog");
        names.add("Suyog");

        Set<String> s=new HashSet<>();

        for (String values:names) {
            if(s.add(values)==false)
                System.out.println(values);
        }

    }
}
