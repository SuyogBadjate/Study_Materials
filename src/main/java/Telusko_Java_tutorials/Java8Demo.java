package Telusko_Java_tutorials;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Java8Demo {
    public static void main(String[] args) {
        List<Integer> values= Arrays.asList(1,2,3,4,5,6);
        //values.forEach(i-> System.out.println(i));
        //Method Reference
        //values.forEach(System.out::println);
        values.forEach(Java8Demo::doubleit);
    }
    public static void doubleit(int i){
        System.out.println(i*2);
    }
}

