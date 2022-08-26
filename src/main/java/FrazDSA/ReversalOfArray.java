package FrazDSA;

import java.util.ArrayList;
import java.util.Collections;

public class ReversalOfArray {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<Integer>() {
            {
                add(10);
                add(9);
                add(8);
                add(4);
                add(7);
            }
        };
        int value=arrList.size()-1;
        int j=0;

        while(j<value+1)
        {
            Collections.swap(arrList,j,value);
            value--;
            j++;
        }
        System.out.println(arrList);

    }
}