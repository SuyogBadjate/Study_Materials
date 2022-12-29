package Telusko_Java_tutorials;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6);

        Function<Integer,Integer> f=new Function<Integer,Integer>(){
            @Override
            public Integer apply(Integer integer) {
                return integer*2;
            }
        };
        BinaryOperator<Integer> b=new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer o, Integer o2) {
                return o+o2;
            }
        };
        Stream s = list.stream();
        Stream s1=s.map(f);

        Integer result=(Integer) s1.reduce(0,b);
        //Stream s2=s1.reduce();
        System.out.println(result);
        //s1.forEach(System.out::println);
        //System.out.println(list.stream().map(i -> i*2).reduce(0,(c,e)->c+e));

        System.out.println(list.stream().map(i->i*2).reduce(0,Integer::sum));
    }

}
