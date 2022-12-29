package Telusko_Java_tutorials;

import java.util.ArrayList;

public class Time {
    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        ArrayList arr=new ArrayList();
        for (int i = 1; i <=10000; i++) {
            arr.add(i);
        }
        long end=System.currentTimeMillis();
        System.out.println(end-start);
    }
}
