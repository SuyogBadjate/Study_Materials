package Telusko_Java_tutorials;

import java.util.*;

public class CollectionsDemo1 {
    public static void main(String[] args) {
//        int values[]=new int [4];
//        Object values1[]=new Object[4];
//        values1[0]=7;
//        values1[1]="String";
//
//        //Collection<Integer> values2 = new ArrayList<>();
//        Collection values2 = new ArrayList<>();
//        values2.add(5);
//        values2.add("Navin");
//        values2.add(5.8f);
//        values2.remove(5);
//
//        Iterator itr= values2.iterator();
//        while(itr.hasNext()) {
//            System.out.println(itr.next());
//        }
//
//        for (Object o:values2) {
//            System.out.println(o);
//        }
//
        List<Integer> values4=new ArrayList<>();
        values4.add(305);
        values4.add(998);
        values4.add(774);
        values4.add(236);
        values4.add(881);

        Comparator<Integer> comp=new ComparatorImpl(){
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1%10>o2%10)
                    return 1;

                return -1;
            }
        };
//        values4.forEach(System.out::println);
//        Collections.sort(values4);
//        Collections.reverse(values4);
        Collections.sort(values4,(o1,o2)->{
            return o1%10>o2%10?1:-1;
        });

        for (int i:values4) {
            System.out.println(i);
        }
//
//        Vector values5=new Vector();
//        values5.add(4);
//        values5.add(6);
//        values5.add(4);
//        values5.add(6);
//        values5.add(4);
//        values5.add(6);
//        values5.add(4);
//        values5.add(6);
//        values5.add(4);
//        values5.add(6);
//        values5.add(4);
//        values5.add(6);
//        values5.add(4);
//        values5.add(6);
//        values5.add(4);
//        values5.add(6);
//        values5.add(4);
//        values5.add(6);
//        values5.add(4);
//        values5.add(6);
//        values5.remove(1);
//        for (Object i:values5) {
//            System.out.println(i);
//        }
//        System.out.println(values5.capacity());
    }
}
