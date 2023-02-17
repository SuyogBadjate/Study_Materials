//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Problem_Solving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Q3_MaxElSeries {

    public static void main(String[] args) {
        int n = 5;
        ArrayList<Integer> list = new ArrayList();
        list.add(0, 0);
        list.add(1, 1);

        for(int i = 1; i < n / 2 + 1; ++i) {
            list.add(i * 2, list.get(i));
            list.add(i * 2 + 1, (Integer)list.get(i) + (Integer)list.get(i + 1));
        }

        Iterator var5 = list.iterator();

        while(var5.hasNext()) {
            Integer e = (Integer)var5.next();
            System.out.println(e);
        }

        System.out.println();
        System.out.println(Collections.max(list));
    }
}
