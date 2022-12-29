package Telusko_Java_tutorials;

import java.util.*;

public class CollectionTricks {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(56,67,90);
        List<Integer> values1 = new ArrayList<Integer>()
        {{
           add(506);
           add(607);
           add(900);
        }};
        List<Integer> values2 = new ArrayList<>();
        values2.add(50);
        values2.add(100);
        values2.add(1,60);

        Random r=new Random();
        for (int i = 1; i <= 100; i++) {
            values2.add(r.nextInt(1000));
        }
        Collections.sort(values2);
        Comparator<Integer> c =new Comparator<Integer>()
        {
            @Override
            public int compare(Integer o1, Integer o2) {
                int diff=0;
                if(o1%10>o2%10) {
                    diff = 1;
                }
                else if (o1%10<o2%10) {
                    diff=-1;
                }
                return diff;
            }
        };
        Collections.sort(values2,c);
        for (int k:values2) {
            System.out.println(k);
        }
    }
}