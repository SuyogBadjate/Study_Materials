package Telusko_Java_tutorials;

import java.util.ArrayList;

public class wrapperDemo {
    public static void main(String[] args) {
        int i=5;
        Integer ii=new Integer(i);
        Integer jj=i;

        int j=jj.intValue();
        int k=jj;

        ArrayList<Integer> values=new ArrayList<Integer>();
        values.add(5);
        values.add(7);

    }
}
